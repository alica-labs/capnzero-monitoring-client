package de.uniks.vs.capnzero.monitoring;

import de.uniks.vs.capnzero.monitoring.event.Event;
import de.uniks.vs.capnzero.monitoring.proxy.EventProxy;

public class MonitorClient {

  private EventProxy eventProxy;

  public MonitorClient(EventProxy proxy) {
    this.eventProxy = proxy;
  }

  public void start() {
    this.eventProxy.startListening();
  }

  public void stop() {
    this.eventProxy.stopListening();
  }

  public boolean hasEvent() {
    return this.eventProxy.hasEvent();
  }

  public Event nextEvent() {
    return this.eventProxy.nextEvent();
  }
}
