package de.uniks.vs.capnzero.monitoring;

import de.uniks.vs.capnzero.monitoring.proxy.CapnzeroEventProxy;

public class MonitorClient {

  private CapnzeroEventProxy eventProxy;
  private boolean running;

  public MonitorClient(CapnzeroEventProxy proxy) {
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
