package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.CreateEvent;

import java.util.Map;

public class CreateEventFactory implements DebugEventFactory
{
  public CreateEventFactory(){}

  @Override
  public CreateEvent buildFromString( Map<String, Object> serializedEvent )
  {
    return new CreateEvent((int) serializedEvent.get("protocol"));
  }
}
