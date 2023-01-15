# RabbitMQ

Skaffold configuration which leverages on the official [RabbitMQ docker image](https://hub.docker.com/_/rabbitmq) with Management plugin enabled. The configuration exposes ports `5672` as a listener and `15672` for web management UI. Credentials to access UI are default `guest/guest`.

More info about RabbitMQ Management plugin [here](https://www.rabbitmq.com/management.html).

```sh
skaffold dev
```
