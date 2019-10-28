# Capnzero Monitoring Java Binding

A java client library for the capnzero-monitoring library.
It implements the generated Capnzero Java binding [capnzero4j](https://github.com/dasys-lab/capnzero4j).

## Requirements

* OpenJDK8 (and higher)
* Maven

## Build

At first, complete the installation instructions for building the submoduole capnzero4j.
The instructions can be found on the page of the module.

Initialize the submodule with

```shell
git submodule update --init
git checkout patch-sst
```

Run the follwowing command

```shell
mvn clean install
```

The jar file can then be found in the target folder.

## Usage

The main class of the client is the `MonitorClient`.
Invoking the `start()` method on it starts the internal proxy which listens for incoming socket events sent by the capnzero-monitoring library.

The Events are internally processed by a `DebugEventHandler` which is passed to the `MonitorClient` at build time.
A sample implementation can be found in the `PrintDebugEventHandler` class.

The address and topic the client listens to may be configured by creating an own instance of the `CapnzeroEventProxy` and passing a `DebugConfiguration` object to it.

The default address for the client is `localhost:9876`.
The default topic for the client is `monitoring`.
