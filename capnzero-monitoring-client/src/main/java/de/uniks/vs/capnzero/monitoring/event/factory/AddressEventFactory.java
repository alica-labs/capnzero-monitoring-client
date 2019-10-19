package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.AddressEvent;

import java.util.Map;

public class AddressEventFactory extends DebugEventFactory
{
  public AddressEventFactory()
  {
  }

  @Override
  public AddressEvent buildFromString( Map<String, Object> serializedEvent )
  {
    String id = DebugEventFactory.parseId(serializedEvent.get("id"));
    String address = (String) serializedEvent.get("address");
    return new AddressEvent(id, address);
  }
}
