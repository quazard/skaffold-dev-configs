# Kafka, Zookeeper and Kafka Magic

Whole Skaffold configuration will spin up a Kafka/Zookeeper cluster with 1 instance each. It will also create an instance of [Kafka Magic](https://www.kafkamagic.com/) to explore the content of the topics in the created Kafka cluster, all these is automatically handled by the configuration.

```sh
skaffold dev --port-forward
```

Kafka Magic can be accessed on port 8080.