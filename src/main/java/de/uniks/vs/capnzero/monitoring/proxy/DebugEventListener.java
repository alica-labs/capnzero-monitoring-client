package de.uniks.vs.capnzero.monitoring.proxy;

import de.uniks.vs.capnzero.monitoring.event.Event;
import de.uniks.vs.capnzero.monitoring.handler.DebugEventHandler;

public interface DebugEventListener {
  void addEventHandler(DebugEventHandler handler);

  void notify(Event event);
}
