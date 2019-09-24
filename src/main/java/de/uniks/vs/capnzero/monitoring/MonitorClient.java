package de.uniks.vs.capnzero.monitoring;

import de.uniks.vs.capnzero.monitoring.event.Event;
import de.uniks.vs.capnzero.monitoring.proxy.DebugEventProxy;
import de.uniks.vs.capnzero.monitoring.handler.DebugEventHandler;

public class MonitorClient {

  private DebugEventProxy eventProxy;
  private boolean running;

  public MonitorClient(DebugEventProxy proxy) {
    this.eventProxy = proxy;
    this.running = false;
  }

  public void start() {
    this.eventProxy.startListening();
    this.running = true;
  }

  public void stop() {
    this.eventProxy.stopListening();
    this.running = false;
  }

  public boolean isRunning() {
    return running;
  }
}
