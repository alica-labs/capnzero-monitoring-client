package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.AddressEvent;

import java.util.Map;

public class AddressEventFactory implements DebugEventFactory
{
  public AddressEventFactory()
  {
  }

  @Override
  public AddressEvent buildFromString( Map<String, String> serializedEvent )
  {
    return new AddressEvent(serializedEvent.get("address"));
  }
}
