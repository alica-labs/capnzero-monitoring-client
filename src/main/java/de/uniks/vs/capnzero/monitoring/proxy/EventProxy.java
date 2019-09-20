package de.uniks.vs.capnzero.monitoring.proxy;

import de.uniks.vs.capnzero.monitoring.event.Event;

public interface EventProxy {

  void startListening();

  void stopListening();

  boolean hasEvent();

  Event nextEvent();

}
