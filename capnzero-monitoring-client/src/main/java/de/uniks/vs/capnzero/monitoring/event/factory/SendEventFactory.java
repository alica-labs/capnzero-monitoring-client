package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.SendEvent;

import java.util.Map;

public class SendEventFactory implements DebugEventFactory
{
  public SendEventFactory()
  {

  }

  @Override
  public SendEvent buildFromString( Map<String, Object> serializedEvent )
  {
    return new SendEvent((String) serializedEvent.get("message"), (String) serializedEvent.get("topic"));
  }
}
