package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.CreateEvent;

import java.util.Map;

public class CreateEventFactory extends DebugEventFactory
{
  public CreateEventFactory(){}

  @Override
  public CreateEvent buildFromString( Map<String, Object> serializedEvent )
  {
    String id = DebugEventFactory.parseId(serializedEvent.get("id"));
    String protocol = (String) serializedEvent.get("protocol");
    return new CreateEvent(id, protocol);
  }
}
