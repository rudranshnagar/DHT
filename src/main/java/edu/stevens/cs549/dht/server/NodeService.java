package edu.stevens.cs549.dht.server;

import com.google.protobuf.Empty;
import edu.stevens.cs549.dht.activity.Dht;
import edu.stevens.cs549.dht.activity.DhtBase;
import edu.stevens.cs549.dht.activity.DhtBase.Failed;
import edu.stevens.cs549.dht.activity.DhtBase.Invalid;
import edu.stevens.cs549.dht.activity.IDhtNode;
import edu.stevens.cs549.dht.activity.IDhtService;
import edu.stevens.cs549.dht.events.EventProducer;
import edu.stevens.cs549.dht.main.Log;
import edu.stevens.cs549.dht.rpc.*;
import edu.stevens.cs549.dht.rpc.DhtServiceGrpc.DhtServiceImplBase;
import edu.stevens.cs549.dht.rpc.NodeInfo;
import io.grpc.stub.StreamObserver;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Additional resource logic.  The Web resource operations call
 * into wrapper operations here.  The main thing these operations do
 * is to call into the DHT service object, and wrap internal exceptions
 * as HTTP response codes (throwing WebApplicationException where necessary).
 * 
 * This should be merged into NodeResource, then that would be the only
 * place in the app where server-side is dependent on JAX-RS.
 * Client dependencies are in WebClient.
 * 
 * The activity (business) logic is in the dht object, which exposes
 * the IDHTResource interface to the Web service.
 */

public class NodeService extends DhtServiceImplBase {
	
	private static final String TAG = NodeService.class.getCanonicalName();
	
	private static Logger logger = Logger.getLogger(TAG);

	/**
	 * Each service request is processed by a distinct service object.
	 *
	 * Shared state is in the state object; we use the singleton pattern to make sure it is shared.
	 */
	private IDhtService getDht() {
		return Dht.getDht();
	}
	
	// TODO: add the missing

	@Override
	public void getPred(Empty request, StreamObserver<OptNodeInfo> responseObserver) {
		try {
			OptNodeInfo optNodeInfo = getDht().getPred();
			responseObserver.onNext(optNodeInfo);
			responseObserver.onCompleted();
		} catch (Exception e) {
			error("getPred failed", e);
			responseObserver.onError(e);
		}
	}

	@Override
	public void getSucc(Empty request, StreamObserver<NodeInfo> responseObserver) {
		try {
			NodeInfo nodeInfo = getDht().getSucc();
			responseObserver.onNext(nodeInfo);
			responseObserver.onCompleted();
		} catch (Exception e) {
			error("getSucc failed", e);
			responseObserver.onError(e);
		}
	}

	@Override
	public void closestPrecedingFinger(Id request, StreamObserver<NodeInfo> responseObserver) {
		try {
			NodeInfo nodeInfo = getDht().closestPrecedingFinger(request.getId());
			responseObserver.onNext(nodeInfo);
			responseObserver.onCompleted();
		} catch (Exception e) {
			error("closestPrecedingFinger failed", e);
			responseObserver.onError(e);
		}
	}

	@Override
	public void notify(NodeBindings request, StreamObserver<OptNodeBindings> responseObserver) {
		try {
			OptNodeBindings optNodeBindings = getDht().notify(request);
			responseObserver.onNext(optNodeBindings);
			responseObserver.onCompleted();
		} catch (Exception e) {
			error("notify failed", e);
			responseObserver.onError(e);
		}
	}

	@Override
	public void getBindings(Key request, StreamObserver<Bindings> responseObserver) {
		try {
			String[] values = getDht().get(request.getKey());
			Bindings.Builder bindingsBuilder = Bindings.newBuilder().setKey(request.getKey());
			for (String value : values) {
				bindingsBuilder.addValue(value);
			}
			responseObserver.onNext(bindingsBuilder.build());
			responseObserver.onCompleted();
		} catch (Exception e) {
			error("getBindings failed", e);
			responseObserver.onError(e);
		}
	}

	@Override
	public void addBinding(Binding request, StreamObserver<Empty> responseObserver) {
		try {
			getDht().add(String.valueOf(request.getKey()),request.getValue());
			responseObserver.onNext(Empty.getDefaultInstance());
			responseObserver.onCompleted();
		} catch (Exception e) {
			error("addBinding failed", e);
			responseObserver.onError(e);
		}
	}

	@Override
	public void deleteBinding(Binding request, StreamObserver<Empty> responseObserver) {
		try {
			getDht().delete(String.valueOf(request.getKey()), request.getValue());
			responseObserver.onNext(Empty.getDefaultInstance());
			responseObserver.onCompleted();
		} catch (Exception e) {
			error("deleteBinding failed", e);
			responseObserver.onError(e);
		}
	}

	@Override
	public void findSuccessor(Id request, StreamObserver<NodeInfo> responseObserver) {
		try {
			NodeInfo nodeInfo = getDht().findSuccessor(request.getId());
			responseObserver.onNext(nodeInfo);
			responseObserver.onCompleted();
		} catch (Exception e) {
			error("findSuccessor failed", e);
			responseObserver.onError(e);
		}
	}

	@Override
	public void listenOn(Subscription request, StreamObserver<Event> responseObserver) {
		try {
			EventProducer eventProducer = EventProducer.create(responseObserver);
			getDht().listenOn(request.getId(), request.getKey(), eventProducer);
		} catch (Exception e) {
			error("listenOn failed", e);
			responseObserver.onError(e);
		}
	}

	@Override
	public void listenOff(Subscription request, StreamObserver<Empty> responseObserver) {
		try {
			getDht().listenOff(request.getId(), request.getKey());
			responseObserver.onNext(Empty.getDefaultInstance());
			responseObserver.onCompleted();
		} catch (Exception e) {
			error("listenOff failed", e);
			responseObserver.onError(e);
		}
	}


	private void error(String mesg, Exception e) {
		logger.log(Level.SEVERE, mesg, e);
	}

	@Override
	public void getNodeInfo(Empty empty, StreamObserver<NodeInfo> responseObserver) {
		Log.weblog(TAG, "getNodeInfo()");
		responseObserver.onNext(getDht().getNodeInfo());
		responseObserver.onCompleted();
	}


}