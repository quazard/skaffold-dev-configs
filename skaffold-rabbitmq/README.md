# RabbitMQ Cluster Operator

Skaffold configuration which leverages on the official [RabbitMQ Cluster Operator](https://github.com/rabbitmq/cluster-operator) to create a RabbitMQ cluster. The configuration exposes ports `5672` as a listener and `15672` for web management UI. 

An initial user is created using the `setup-user.yaml` file with the following credentials:

```sh
username: dev_user
password: dev_password
```

Admin credentials created by default on RabbitMQ can be retrieved using the following commands:

```sh
kubectl -n default get secret rabbitmq-ha-default-user -o jsonpath="{.data.username}" | base64 --decode
kubectl -n default get secret rabbitmq-ha-default-user -o jsonpath="{.data.password}" | base64 --decode
```

## Usage

Run Skaffold to instantiate the cluster:

```sh
skaffold dev
```


### Management

Terminal commands to create a new user (or use management UI instead):

```sh
# 1. Create the user
rabbitmqctl add_user <username> <password>

# 2. Tag the user as an administrator (optional, but useful for management)
rabbitmqctl set_user_tags <username> administrator

# 3. Grant permissions to the virtual host (default is "/")
# Syntax: set_permissions -p <vhost> <user> <conf> <write> <read>
rabbitmqctl set_permissions -p / <username> ".*" ".*" ".*"
```

Terminal commands to create a user through kubectl:

```sh
kubectl -n default exec -it rabbitmq-ha-server-0 -- rabbitmqctl add_user myuser mypassword
kubectl -n default exec -it rabbitmq-ha-server-0 -- rabbitmqctl set_user_tags myuser administrator
kubectl -n default exec -it rabbitmq-ha-server-0 -- rabbitmqctl set_permissions -p / myuser ".*" ".*" ".*"
```

### References

* [RabbitMQ Cluster Operator Installation](https://www.rabbitmq.com/kubernetes/operator/install-operator)
* [RabbitMQ Using Operator](https://www.rabbitmq.com/kubernetes/operator/using-operator)
* [RabbitMQ Management plugin](https://www.rabbitmq.com/management.html)
