package de.uniks.vs.capnzero.monitoring.handler;

import de.uniks.vs.capnzero.monitoring.event.Event;

public class PrintDebugEventHandler implements DebugEventHandler {

  @Override
  public void handleDebugEvent(Event event) {
    System.out.println(event);
  }

}
