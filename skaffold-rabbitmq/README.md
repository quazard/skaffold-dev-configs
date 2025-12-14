# RabbitMQ Cluster Operator

Skaffold configuration which leverages on the official [RabbitMQ Cluster Operator](https://github.com/rabbitmq/cluster-operator) to create a RabbitMQ cluster. The configuration exposes ports `5672` as a listener and `15672` for web management UI. 

Credentials to access UI can be retrieved using the following commands:

```sh
kubectl -n default get secret rabbitmq-ha-default-user -o jsonpath="{.data.username}" | base64 --decode
kubectl -n default get secret rabbitmq-ha-default-user -o jsonpath="{.data.password}" | base64 --decode
```

### Prerequisites

Install the cluster operator, this is a one-time operation:

```sh
kubectl apply -f cluster-operator.yaml
```

### Usage

Run Skaffold to instantiate the cluster:

```sh
skaffold dev
```

### References

* [RabbitMQ Cluster Operator Installation](https://www.rabbitmq.com/kubernetes/operator/install-operator)
* [RabbitMQ Using Operator](https://www.rabbitmq.com/kubernetes/operator/using-operator)
* [RabbitMQ Management plugin](https://www.rabbitmq.com/management.html)
