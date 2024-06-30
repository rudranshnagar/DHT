package edu.stevens.cs549.dht.activity;


import edu.stevens.cs549.dht.main.App;
import io.grpc.StatusRuntimeException;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.stevens.cs549.dht.main.Log;

/*
 * Background thread performs periodic stabilization (on successor)
 * and fixes finger pointers.
 */
public class Background implements Runnable {
	
	private static final String TAG = Background.class.getCanonicalName();
	
	private static final Logger logger = Logger.getLogger(TAG);

	protected long interval;
	protected int ntimes;
	protected App app;
	protected IDhtBackground dht;

	public Background(long msecs, int n, App m, IDhtBackground d) {
		interval = msecs;
		ntimes = n;
		app = m;
		dht = d;
	}

	public void run() {
		try {
			while (!app.isTerminated()) {
				try {
					Thread.sleep(interval);
					Log.background(TAG, "Performing background stabilization.");
					dht.checkPredecessor();
					dht.stabilize();
					dht.fixFingers(ntimes);
				} catch (DhtBase.Failed e) {
					Log.background(TAG, "Remote failure during background processing 1: " + e.getMessage());
				}
			}
		} catch (InterruptedException e) {
			logger.log(Level.SEVERE, "Exiting background thread: "+e.getMessage());
		} catch (DhtBase.Error e) {
			logger.log(Level.SEVERE, "Internal error during background processing: "+e.getMessage());
		} catch (StatusRuntimeException e) {
			logger.log(Level.SEVERE, "Uncaught exception during background processing: "+e.getMessage());
		}
	}

}
