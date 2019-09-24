package de.uniks.vs.capnzero.monitoring.proxy;

import de.uniks.vs.capnzero.monitoring.event.Event;

public interface DebugEventProxy {
  void startListening();

  void stopListening();
}
