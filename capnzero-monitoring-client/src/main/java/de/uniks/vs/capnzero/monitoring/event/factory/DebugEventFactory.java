package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.DebugEvent;

import java.util.Map;

public abstract class DebugEventFactory
{
  static String parseId(Object id)
  {
    try
    {
      return (String) id;
    } catch( ClassCastException e)
    {
      return "" + (int) id;
    }
  }

  abstract  public DebugEvent buildFromString( Map<String, Object> serializedEvent);
}
