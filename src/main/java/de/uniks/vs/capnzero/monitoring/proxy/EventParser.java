package de.uniks.vs.capnzero.monitoring.proxy;

import de.uniks.vs.capnzero.monitoring.event.Event;

public interface EventParser {

  Event parse(String message);

}
