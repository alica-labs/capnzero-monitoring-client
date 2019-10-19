package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.SendEvent;

import java.util.Map;

public class SendEventFactory extends DebugEventFactory
{
  public SendEventFactory()
  {

  }

  @Override
  public SendEvent buildFromString( Map<String, Object> serializedEvent )
  {
    String id = DebugEventFactory.parseId(serializedEvent.get("id"));
    String message = ( String ) serializedEvent.get("message");
    String topic = ( String ) serializedEvent.get("topic");

    return new SendEvent(id, message, topic);
  }
}
