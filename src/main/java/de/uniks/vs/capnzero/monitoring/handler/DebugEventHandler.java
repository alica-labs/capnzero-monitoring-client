package de.uniks.vs.capnzero.monitoring.handler;

import de.uniks.vs.capnzero.monitoring.event.DebugEvent;

public interface DebugEventHandler {
  void handleDebugEvent( DebugEvent event);
}
