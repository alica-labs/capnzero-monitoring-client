package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.DebugEvent;

import java.util.Map;

public interface DebugEventFactory
{
  DebugEvent buildFromString( Map<String, String> serializedEvent);
}
