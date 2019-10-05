package de.uniks.vs.capnzero.monitoring.config;

public class DebugConfiguration {
  private String address = "127.0.0.1:9876";
  private String topic = "monitoring";

  public DebugConfiguration() {
  }

  public DebugConfiguration(String address, String topic) {
    this.setAddress(address);
    this.setTopic(topic);
  }

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}