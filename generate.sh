java -jar submodules/JNAerator/jnaerator/target/jnaerator-0.13-SNAPSHOT-shaded.jar  \
  -library capnzero-monitoring \
  -mode StandaloneJar \
  -I submodules/capnzero-monitoring/include \
  -I submodules/capnzero-monitoring/submodules/capnzero/capnzero/include \
  submodules/capnzero-monitoring/lib/libcapnzeroMonitoring.so \
  submodules/capnzero-monitoring/include/**.h
  
