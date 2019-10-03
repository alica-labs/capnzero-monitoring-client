package de.uniks.vs.capnzero.monitoring;

import de.uniks.vs.capnzero.monitoring.event.DebugEvent;
import de.uniks.vs.capnzero.monitoring.event.factory.*;
import org.yaml.snakeyaml.Yaml;

import java.util.HashMap;
import java.util.Map;

public class YamlEventParser implements EventParser {

  private Map<String, DebugEventFactory> eventTypeChainOfResponsibility;
  private Yaml yaml;

  public YamlEventParser()
  {
    eventTypeChainOfResponsibility = new HashMap<>();
    eventTypeChainOfResponsibility.put("address", new AddressEventFactory());
    eventTypeChainOfResponsibility.put("topic", new TopicEventFactory());
    eventTypeChainOfResponsibility.put("receive", new ReceiveEventFactory());
    eventTypeChainOfResponsibility.put("send", new SendEventFactory());
    eventTypeChainOfResponsibility.put("subscribe", new SubscribeEventFactory());
    eventTypeChainOfResponsibility.put("create", new CreateEventFactory());

    yaml = new Yaml();
  }

  @Override
  public DebugEvent parse(String message) {
    if(message == "" || message == null)
    {
      throw new InvalidEventException("Tried to parse empty message");
    }

    Map<String, String> parsedMessage = yaml.load(message);
    String eventType = parsedMessage.get("type");

    if(eventType == null)
    {
      throw new InvalidEventException("No type-attribute found in serialized event");
    }

    DebugEvent event = eventTypeChainOfResponsibility.get(eventType).buildFromString(parsedMessage);

    return event;
  }
}
