package de.uniks.vs.capnzero.monitoring;

import de.uniks.vs.capnzero.monitoring.event.DebugEvent;

public interface EventParser {

  DebugEvent parse( String message);

}
