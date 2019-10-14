package de.uniks.vs.capnzero.monitoring.event;

public class AddressEvent implements DebugEvent
{
  private final String address;
  private final String type;

  public AddressEvent( String address )
  {
    this.type = "address";
    this.address = address;
  }

  public String getType()
  {
    return type;
  }

  public String getAddress()
  {
    return address;
  }

  @Override
  public String toString()
  {
    return String.format("{\"type\": \"%s\", \"address\": \"%s\"}", type, address);
  }
}
