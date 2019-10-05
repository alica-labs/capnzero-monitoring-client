package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.AddressEvent;

import java.util.Map;

public class AddressEventFactory implements DebugEventFactory
{
  public AddressEventFactory()
  {
  }

  @Override
  public AddressEvent buildFromString( Map<String, Object> serializedEvent )
  {
    return new AddressEvent((String) serializedEvent.get("address"));
  }
}
