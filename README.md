# Capnzero Monitoring Java Binding

## Installation
1. In project root run "git submodule update --init --recursive"
2. In Capnzero lib 
  - set the c++ standard to 14
  - add the following line below the target definition of the library: "target_compile_options(${PROJECT_NAME} PRIVATE -fPIC)"
3. In submodule JNAerator run "mvn clean install"
4. In submodule capnzero-monitoring run "cmake ." and "make"

## Generation
