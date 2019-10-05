package de.uniks.vs.capnzero.monitoring.handler;

import de.uniks.vs.capnzero.monitoring.event.DebugEvent;

public class PrintDebugEventHandler implements DebugEventHandler {

  @Override
  public void handleDebugEvent( DebugEvent event) {
    System.out.println();
    System.out.println("event: " );
    System.out.println(event);
    System.out.println();
  }

}
