# Kafka, Zookeeper and Kafka Magic - Secured with SASL/SCRAM

Whole Skaffold configuration will spin up a Kafka/Zookeeper cluster with 1 instance each. It will also create an instance of [Kafka Magic](https://www.kafkamagic.com/) to explore the content of the topics in the created Kafka cluster, all these is automatically handled by the configuration.

Internal communication is done using PLAINTEXT security protocol, external communication will use SASL_PLAINTEXT as security protocol and SCRAM-SHA-256 as sasl mechanism to authenticate producers and consumers.

```sh
skaffold dev
```

Kafka Magic can be accessed on port 8080.