package de.uniks.vs.capnzero.monitoring.event;

public class AddressEvent extends DebugEvent
{
  private String address;

  public AddressEvent( String id, String address )
  {
    this.id = id;
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
    return String.format("{\"id\":\"%s\", \"type\": \"%s\", \"address\": \"%s\"}", id, type, address);
  }
}
