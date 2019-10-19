package de.uniks.vs.capnzero.monitoring.event;

public class DebugEvent
{
  protected String id;
  protected String type;

  public DebugEvent(){}

  public DebugEvent( String id, String type)
  {
    this.id = id;
    this.type = type;
  }

  public String getId()
  {
    return id;
  }

  public void setId( String id )
  {
    this.id = id;
  }

  public String getType()
  {
    return type;
  }

  public void setType( String type )
  {
    this.type = type;
  }
}
