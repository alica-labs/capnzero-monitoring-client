package de.uniks.vs.capnzero.monitoring.handler;

import de.uniks.vs.capnzero.monitoring.event.Event;

public interface DebugEventHandler {
  void handleDebugEvent(Event event);
}
