package edu.stevens.cs549.dht.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: dht.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DhtServiceGrpc {

  private DhtServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "DhtService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      edu.stevens.cs549.dht.rpc.NodeInfo> getGetNodeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNodeInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = edu.stevens.cs549.dht.rpc.NodeInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      edu.stevens.cs549.dht.rpc.NodeInfo> getGetNodeInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, edu.stevens.cs549.dht.rpc.NodeInfo> getGetNodeInfoMethod;
    if ((getGetNodeInfoMethod = DhtServiceGrpc.getGetNodeInfoMethod) == null) {
      synchronized (DhtServiceGrpc.class) {
        if ((getGetNodeInfoMethod = DhtServiceGrpc.getGetNodeInfoMethod) == null) {
          DhtServiceGrpc.getGetNodeInfoMethod = getGetNodeInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, edu.stevens.cs549.dht.rpc.NodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getNodeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.NodeInfo.getDefaultInstance()))
              .setSchemaDescriptor(new DhtServiceMethodDescriptorSupplier("getNodeInfo"))
              .build();
        }
      }
    }
    return getGetNodeInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      edu.stevens.cs549.dht.rpc.OptNodeInfo> getGetPredMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPred",
      requestType = com.google.protobuf.Empty.class,
      responseType = edu.stevens.cs549.dht.rpc.OptNodeInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      edu.stevens.cs549.dht.rpc.OptNodeInfo> getGetPredMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, edu.stevens.cs549.dht.rpc.OptNodeInfo> getGetPredMethod;
    if ((getGetPredMethod = DhtServiceGrpc.getGetPredMethod) == null) {
      synchronized (DhtServiceGrpc.class) {
        if ((getGetPredMethod = DhtServiceGrpc.getGetPredMethod) == null) {
          DhtServiceGrpc.getGetPredMethod = getGetPredMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, edu.stevens.cs549.dht.rpc.OptNodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPred"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.OptNodeInfo.getDefaultInstance()))
              .setSchemaDescriptor(new DhtServiceMethodDescriptorSupplier("getPred"))
              .build();
        }
      }
    }
    return getGetPredMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      edu.stevens.cs549.dht.rpc.NodeInfo> getGetSuccMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSucc",
      requestType = com.google.protobuf.Empty.class,
      responseType = edu.stevens.cs549.dht.rpc.NodeInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      edu.stevens.cs549.dht.rpc.NodeInfo> getGetSuccMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, edu.stevens.cs549.dht.rpc.NodeInfo> getGetSuccMethod;
    if ((getGetSuccMethod = DhtServiceGrpc.getGetSuccMethod) == null) {
      synchronized (DhtServiceGrpc.class) {
        if ((getGetSuccMethod = DhtServiceGrpc.getGetSuccMethod) == null) {
          DhtServiceGrpc.getGetSuccMethod = getGetSuccMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, edu.stevens.cs549.dht.rpc.NodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSucc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.NodeInfo.getDefaultInstance()))
              .setSchemaDescriptor(new DhtServiceMethodDescriptorSupplier("getSucc"))
              .build();
        }
      }
    }
    return getGetSuccMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Id,
      edu.stevens.cs549.dht.rpc.NodeInfo> getClosestPrecedingFingerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "closestPrecedingFinger",
      requestType = edu.stevens.cs549.dht.rpc.Id.class,
      responseType = edu.stevens.cs549.dht.rpc.NodeInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Id,
      edu.stevens.cs549.dht.rpc.NodeInfo> getClosestPrecedingFingerMethod() {
    io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Id, edu.stevens.cs549.dht.rpc.NodeInfo> getClosestPrecedingFingerMethod;
    if ((getClosestPrecedingFingerMethod = DhtServiceGrpc.getClosestPrecedingFingerMethod) == null) {
      synchronized (DhtServiceGrpc.class) {
        if ((getClosestPrecedingFingerMethod = DhtServiceGrpc.getClosestPrecedingFingerMethod) == null) {
          DhtServiceGrpc.getClosestPrecedingFingerMethod = getClosestPrecedingFingerMethod =
              io.grpc.MethodDescriptor.<edu.stevens.cs549.dht.rpc.Id, edu.stevens.cs549.dht.rpc.NodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "closestPrecedingFinger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.NodeInfo.getDefaultInstance()))
              .setSchemaDescriptor(new DhtServiceMethodDescriptorSupplier("closestPrecedingFinger"))
              .build();
        }
      }
    }
    return getClosestPrecedingFingerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.NodeBindings,
      edu.stevens.cs549.dht.rpc.OptNodeBindings> getNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "notify",
      requestType = edu.stevens.cs549.dht.rpc.NodeBindings.class,
      responseType = edu.stevens.cs549.dht.rpc.OptNodeBindings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.NodeBindings,
      edu.stevens.cs549.dht.rpc.OptNodeBindings> getNotifyMethod() {
    io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.NodeBindings, edu.stevens.cs549.dht.rpc.OptNodeBindings> getNotifyMethod;
    if ((getNotifyMethod = DhtServiceGrpc.getNotifyMethod) == null) {
      synchronized (DhtServiceGrpc.class) {
        if ((getNotifyMethod = DhtServiceGrpc.getNotifyMethod) == null) {
          DhtServiceGrpc.getNotifyMethod = getNotifyMethod =
              io.grpc.MethodDescriptor.<edu.stevens.cs549.dht.rpc.NodeBindings, edu.stevens.cs549.dht.rpc.OptNodeBindings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "notify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.NodeBindings.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.OptNodeBindings.getDefaultInstance()))
              .setSchemaDescriptor(new DhtServiceMethodDescriptorSupplier("notify"))
              .build();
        }
      }
    }
    return getNotifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Key,
      edu.stevens.cs549.dht.rpc.Bindings> getGetBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBindings",
      requestType = edu.stevens.cs549.dht.rpc.Key.class,
      responseType = edu.stevens.cs549.dht.rpc.Bindings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Key,
      edu.stevens.cs549.dht.rpc.Bindings> getGetBindingsMethod() {
    io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Key, edu.stevens.cs549.dht.rpc.Bindings> getGetBindingsMethod;
    if ((getGetBindingsMethod = DhtServiceGrpc.getGetBindingsMethod) == null) {
      synchronized (DhtServiceGrpc.class) {
        if ((getGetBindingsMethod = DhtServiceGrpc.getGetBindingsMethod) == null) {
          DhtServiceGrpc.getGetBindingsMethod = getGetBindingsMethod =
              io.grpc.MethodDescriptor.<edu.stevens.cs549.dht.rpc.Key, edu.stevens.cs549.dht.rpc.Bindings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.Key.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.Bindings.getDefaultInstance()))
              .setSchemaDescriptor(new DhtServiceMethodDescriptorSupplier("getBindings"))
              .build();
        }
      }
    }
    return getGetBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Binding,
      com.google.protobuf.Empty> getAddBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addBinding",
      requestType = edu.stevens.cs549.dht.rpc.Binding.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Binding,
      com.google.protobuf.Empty> getAddBindingMethod() {
    io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Binding, com.google.protobuf.Empty> getAddBindingMethod;
    if ((getAddBindingMethod = DhtServiceGrpc.getAddBindingMethod) == null) {
      synchronized (DhtServiceGrpc.class) {
        if ((getAddBindingMethod = DhtServiceGrpc.getAddBindingMethod) == null) {
          DhtServiceGrpc.getAddBindingMethod = getAddBindingMethod =
              io.grpc.MethodDescriptor.<edu.stevens.cs549.dht.rpc.Binding, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.Binding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DhtServiceMethodDescriptorSupplier("addBinding"))
              .build();
        }
      }
    }
    return getAddBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Binding,
      com.google.protobuf.Empty> getDeleteBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteBinding",
      requestType = edu.stevens.cs549.dht.rpc.Binding.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Binding,
      com.google.protobuf.Empty> getDeleteBindingMethod() {
    io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Binding, com.google.protobuf.Empty> getDeleteBindingMethod;
    if ((getDeleteBindingMethod = DhtServiceGrpc.getDeleteBindingMethod) == null) {
      synchronized (DhtServiceGrpc.class) {
        if ((getDeleteBindingMethod = DhtServiceGrpc.getDeleteBindingMethod) == null) {
          DhtServiceGrpc.getDeleteBindingMethod = getDeleteBindingMethod =
              io.grpc.MethodDescriptor.<edu.stevens.cs549.dht.rpc.Binding, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.Binding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DhtServiceMethodDescriptorSupplier("deleteBinding"))
              .build();
        }
      }
    }
    return getDeleteBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Id,
      edu.stevens.cs549.dht.rpc.NodeInfo> getFindSuccessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findSuccessor",
      requestType = edu.stevens.cs549.dht.rpc.Id.class,
      responseType = edu.stevens.cs549.dht.rpc.NodeInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Id,
      edu.stevens.cs549.dht.rpc.NodeInfo> getFindSuccessorMethod() {
    io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Id, edu.stevens.cs549.dht.rpc.NodeInfo> getFindSuccessorMethod;
    if ((getFindSuccessorMethod = DhtServiceGrpc.getFindSuccessorMethod) == null) {
      synchronized (DhtServiceGrpc.class) {
        if ((getFindSuccessorMethod = DhtServiceGrpc.getFindSuccessorMethod) == null) {
          DhtServiceGrpc.getFindSuccessorMethod = getFindSuccessorMethod =
              io.grpc.MethodDescriptor.<edu.stevens.cs549.dht.rpc.Id, edu.stevens.cs549.dht.rpc.NodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findSuccessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.NodeInfo.getDefaultInstance()))
              .setSchemaDescriptor(new DhtServiceMethodDescriptorSupplier("findSuccessor"))
              .build();
        }
      }
    }
    return getFindSuccessorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Subscription,
      edu.stevens.cs549.dht.rpc.Event> getListenOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listenOn",
      requestType = edu.stevens.cs549.dht.rpc.Subscription.class,
      responseType = edu.stevens.cs549.dht.rpc.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Subscription,
      edu.stevens.cs549.dht.rpc.Event> getListenOnMethod() {
    io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Subscription, edu.stevens.cs549.dht.rpc.Event> getListenOnMethod;
    if ((getListenOnMethod = DhtServiceGrpc.getListenOnMethod) == null) {
      synchronized (DhtServiceGrpc.class) {
        if ((getListenOnMethod = DhtServiceGrpc.getListenOnMethod) == null) {
          DhtServiceGrpc.getListenOnMethod = getListenOnMethod =
              io.grpc.MethodDescriptor.<edu.stevens.cs549.dht.rpc.Subscription, edu.stevens.cs549.dht.rpc.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listenOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.Subscription.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.Event.getDefaultInstance()))
              .setSchemaDescriptor(new DhtServiceMethodDescriptorSupplier("listenOn"))
              .build();
        }
      }
    }
    return getListenOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Subscription,
      com.google.protobuf.Empty> getListenOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listenOff",
      requestType = edu.stevens.cs549.dht.rpc.Subscription.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Subscription,
      com.google.protobuf.Empty> getListenOffMethod() {
    io.grpc.MethodDescriptor<edu.stevens.cs549.dht.rpc.Subscription, com.google.protobuf.Empty> getListenOffMethod;
    if ((getListenOffMethod = DhtServiceGrpc.getListenOffMethod) == null) {
      synchronized (DhtServiceGrpc.class) {
        if ((getListenOffMethod = DhtServiceGrpc.getListenOffMethod) == null) {
          DhtServiceGrpc.getListenOffMethod = getListenOffMethod =
              io.grpc.MethodDescriptor.<edu.stevens.cs549.dht.rpc.Subscription, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listenOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.stevens.cs549.dht.rpc.Subscription.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DhtServiceMethodDescriptorSupplier("listenOff"))
              .build();
        }
      }
    }
    return getListenOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DhtServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DhtServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DhtServiceStub>() {
        @java.lang.Override
        public DhtServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DhtServiceStub(channel, callOptions);
        }
      };
    return DhtServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DhtServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DhtServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DhtServiceBlockingStub>() {
        @java.lang.Override
        public DhtServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DhtServiceBlockingStub(channel, callOptions);
        }
      };
    return DhtServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DhtServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DhtServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DhtServiceFutureStub>() {
        @java.lang.Override
        public DhtServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DhtServiceFutureStub(channel, callOptions);
        }
      };
    return DhtServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getNodeInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.NodeInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNodeInfoMethod(), responseObserver);
    }

    /**
     */
    default void getPred(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.OptNodeInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPredMethod(), responseObserver);
    }

    /**
     */
    default void getSucc(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.NodeInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSuccMethod(), responseObserver);
    }

    /**
     */
    default void closestPrecedingFinger(edu.stevens.cs549.dht.rpc.Id request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.NodeInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClosestPrecedingFingerMethod(), responseObserver);
    }

    /**
     * <pre>
     * The input data is for the target node to back up predecessor's bindings (if we are doing backup).
     * The output data is the bindings being transferred from this node to its new predecessor.
     * </pre>
     */
    default void notify(edu.stevens.cs549.dht.rpc.NodeBindings request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.OptNodeBindings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotifyMethod(), responseObserver);
    }

    /**
     */
    default void getBindings(edu.stevens.cs549.dht.rpc.Key request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.Bindings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBindingsMethod(), responseObserver);
    }

    /**
     */
    default void addBinding(edu.stevens.cs549.dht.rpc.Binding request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddBindingMethod(), responseObserver);
    }

    /**
     */
    default void deleteBinding(edu.stevens.cs549.dht.rpc.Binding request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBindingMethod(), responseObserver);
    }

    /**
     */
    default void findSuccessor(edu.stevens.cs549.dht.rpc.Id request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.NodeInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindSuccessorMethod(), responseObserver);
    }

    /**
     */
    default void listenOn(edu.stevens.cs549.dht.rpc.Subscription request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListenOnMethod(), responseObserver);
    }

    /**
     */
    default void listenOff(edu.stevens.cs549.dht.rpc.Subscription request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListenOffMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DhtService.
   */
  public static abstract class DhtServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DhtServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DhtService.
   */
  public static final class DhtServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DhtServiceStub> {
    private DhtServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DhtServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DhtServiceStub(channel, callOptions);
    }

    /**
     */
    public void getNodeInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.NodeInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPred(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.OptNodeInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPredMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSucc(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.NodeInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSuccMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closestPrecedingFinger(edu.stevens.cs549.dht.rpc.Id request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.NodeInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClosestPrecedingFingerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The input data is for the target node to back up predecessor's bindings (if we are doing backup).
     * The output data is the bindings being transferred from this node to its new predecessor.
     * </pre>
     */
    public void notify(edu.stevens.cs549.dht.rpc.NodeBindings request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.OptNodeBindings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBindings(edu.stevens.cs549.dht.rpc.Key request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.Bindings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addBinding(edu.stevens.cs549.dht.rpc.Binding request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBinding(edu.stevens.cs549.dht.rpc.Binding request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findSuccessor(edu.stevens.cs549.dht.rpc.Id request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.NodeInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindSuccessorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listenOn(edu.stevens.cs549.dht.rpc.Subscription request,
        io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListenOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listenOff(edu.stevens.cs549.dht.rpc.Subscription request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListenOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DhtService.
   */
  public static final class DhtServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DhtServiceBlockingStub> {
    private DhtServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DhtServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DhtServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public edu.stevens.cs549.dht.rpc.NodeInfo getNodeInfo(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNodeInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.stevens.cs549.dht.rpc.OptNodeInfo getPred(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPredMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.stevens.cs549.dht.rpc.NodeInfo getSucc(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSuccMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.stevens.cs549.dht.rpc.NodeInfo closestPrecedingFinger(edu.stevens.cs549.dht.rpc.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClosestPrecedingFingerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The input data is for the target node to back up predecessor's bindings (if we are doing backup).
     * The output data is the bindings being transferred from this node to its new predecessor.
     * </pre>
     */
    public edu.stevens.cs549.dht.rpc.OptNodeBindings notify(edu.stevens.cs549.dht.rpc.NodeBindings request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.stevens.cs549.dht.rpc.Bindings getBindings(edu.stevens.cs549.dht.rpc.Key request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBindingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty addBinding(edu.stevens.cs549.dht.rpc.Binding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddBindingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteBinding(edu.stevens.cs549.dht.rpc.Binding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBindingMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.stevens.cs549.dht.rpc.NodeInfo findSuccessor(edu.stevens.cs549.dht.rpc.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindSuccessorMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<edu.stevens.cs549.dht.rpc.Event> listenOn(
        edu.stevens.cs549.dht.rpc.Subscription request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListenOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty listenOff(edu.stevens.cs549.dht.rpc.Subscription request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListenOffMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DhtService.
   */
  public static final class DhtServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DhtServiceFutureStub> {
    private DhtServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DhtServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DhtServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.stevens.cs549.dht.rpc.NodeInfo> getNodeInfo(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.stevens.cs549.dht.rpc.OptNodeInfo> getPred(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPredMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.stevens.cs549.dht.rpc.NodeInfo> getSucc(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSuccMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.stevens.cs549.dht.rpc.NodeInfo> closestPrecedingFinger(
        edu.stevens.cs549.dht.rpc.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClosestPrecedingFingerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The input data is for the target node to back up predecessor's bindings (if we are doing backup).
     * The output data is the bindings being transferred from this node to its new predecessor.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.stevens.cs549.dht.rpc.OptNodeBindings> notify(
        edu.stevens.cs549.dht.rpc.NodeBindings request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.stevens.cs549.dht.rpc.Bindings> getBindings(
        edu.stevens.cs549.dht.rpc.Key request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBindingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addBinding(
        edu.stevens.cs549.dht.rpc.Binding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddBindingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBinding(
        edu.stevens.cs549.dht.rpc.Binding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBindingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.stevens.cs549.dht.rpc.NodeInfo> findSuccessor(
        edu.stevens.cs549.dht.rpc.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindSuccessorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> listenOff(
        edu.stevens.cs549.dht.rpc.Subscription request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListenOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NODE_INFO = 0;
  private static final int METHODID_GET_PRED = 1;
  private static final int METHODID_GET_SUCC = 2;
  private static final int METHODID_CLOSEST_PRECEDING_FINGER = 3;
  private static final int METHODID_NOTIFY = 4;
  private static final int METHODID_GET_BINDINGS = 5;
  private static final int METHODID_ADD_BINDING = 6;
  private static final int METHODID_DELETE_BINDING = 7;
  private static final int METHODID_FIND_SUCCESSOR = 8;
  private static final int METHODID_LISTEN_ON = 9;
  private static final int METHODID_LISTEN_OFF = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.NodeInfo>) responseObserver);
          break;
        case METHODID_GET_PRED:
          serviceImpl.getPred((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.OptNodeInfo>) responseObserver);
          break;
        case METHODID_GET_SUCC:
          serviceImpl.getSucc((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.NodeInfo>) responseObserver);
          break;
        case METHODID_CLOSEST_PRECEDING_FINGER:
          serviceImpl.closestPrecedingFinger((edu.stevens.cs549.dht.rpc.Id) request,
              (io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.NodeInfo>) responseObserver);
          break;
        case METHODID_NOTIFY:
          serviceImpl.notify((edu.stevens.cs549.dht.rpc.NodeBindings) request,
              (io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.OptNodeBindings>) responseObserver);
          break;
        case METHODID_GET_BINDINGS:
          serviceImpl.getBindings((edu.stevens.cs549.dht.rpc.Key) request,
              (io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.Bindings>) responseObserver);
          break;
        case METHODID_ADD_BINDING:
          serviceImpl.addBinding((edu.stevens.cs549.dht.rpc.Binding) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_BINDING:
          serviceImpl.deleteBinding((edu.stevens.cs549.dht.rpc.Binding) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FIND_SUCCESSOR:
          serviceImpl.findSuccessor((edu.stevens.cs549.dht.rpc.Id) request,
              (io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.NodeInfo>) responseObserver);
          break;
        case METHODID_LISTEN_ON:
          serviceImpl.listenOn((edu.stevens.cs549.dht.rpc.Subscription) request,
              (io.grpc.stub.StreamObserver<edu.stevens.cs549.dht.rpc.Event>) responseObserver);
          break;
        case METHODID_LISTEN_OFF:
          serviceImpl.listenOff((edu.stevens.cs549.dht.rpc.Subscription) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetNodeInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              edu.stevens.cs549.dht.rpc.NodeInfo>(
                service, METHODID_GET_NODE_INFO)))
        .addMethod(
          getGetPredMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              edu.stevens.cs549.dht.rpc.OptNodeInfo>(
                service, METHODID_GET_PRED)))
        .addMethod(
          getGetSuccMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              edu.stevens.cs549.dht.rpc.NodeInfo>(
                service, METHODID_GET_SUCC)))
        .addMethod(
          getClosestPrecedingFingerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.stevens.cs549.dht.rpc.Id,
              edu.stevens.cs549.dht.rpc.NodeInfo>(
                service, METHODID_CLOSEST_PRECEDING_FINGER)))
        .addMethod(
          getNotifyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.stevens.cs549.dht.rpc.NodeBindings,
              edu.stevens.cs549.dht.rpc.OptNodeBindings>(
                service, METHODID_NOTIFY)))
        .addMethod(
          getGetBindingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.stevens.cs549.dht.rpc.Key,
              edu.stevens.cs549.dht.rpc.Bindings>(
                service, METHODID_GET_BINDINGS)))
        .addMethod(
          getAddBindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.stevens.cs549.dht.rpc.Binding,
              com.google.protobuf.Empty>(
                service, METHODID_ADD_BINDING)))
        .addMethod(
          getDeleteBindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.stevens.cs549.dht.rpc.Binding,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_BINDING)))
        .addMethod(
          getFindSuccessorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.stevens.cs549.dht.rpc.Id,
              edu.stevens.cs549.dht.rpc.NodeInfo>(
                service, METHODID_FIND_SUCCESSOR)))
        .addMethod(
          getListenOnMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              edu.stevens.cs549.dht.rpc.Subscription,
              edu.stevens.cs549.dht.rpc.Event>(
                service, METHODID_LISTEN_ON)))
        .addMethod(
          getListenOffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.stevens.cs549.dht.rpc.Subscription,
              com.google.protobuf.Empty>(
                service, METHODID_LISTEN_OFF)))
        .build();
  }

  private static abstract class DhtServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DhtServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.stevens.cs549.dht.rpc.Dht.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DhtService");
    }
  }

  private static final class DhtServiceFileDescriptorSupplier
      extends DhtServiceBaseDescriptorSupplier {
    DhtServiceFileDescriptorSupplier() {}
  }

  private static final class DhtServiceMethodDescriptorSupplier
      extends DhtServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DhtServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DhtServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DhtServiceFileDescriptorSupplier())
              .addMethod(getGetNodeInfoMethod())
              .addMethod(getGetPredMethod())
              .addMethod(getGetSuccMethod())
              .addMethod(getClosestPrecedingFingerMethod())
              .addMethod(getNotifyMethod())
              .addMethod(getGetBindingsMethod())
              .addMethod(getAddBindingMethod())
              .addMethod(getDeleteBindingMethod())
              .addMethod(getFindSuccessorMethod())
              .addMethod(getListenOnMethod())
              .addMethod(getListenOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
