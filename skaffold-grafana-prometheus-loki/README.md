# Grafana, Prometheus and Loki

Create a Grafana, Prometheus and Loki instance for local development, with each component's official documentation:

- [Grafana Documentation](https://grafana.com/docs/grafana/latest/) - Official documentation for Grafana, the open source observability platform
- [Prometheus Documentation](https://prometheus.io/docs/introduction/overview/) - Official documentation for Prometheus, the time series database
- [Loki Documentation](https://grafana.com/docs/loki/latest/) - Official documentation for Loki, the log aggregation system

```sh
# First time
helm repo add grafana https://grafana.github.io/helm-charts
helm repo add prometheus-community https://prometheus-community.github.io/helm-charts
```

```sh
skaffold dev
```

> Note: Grafana admin password has to be retrieved from secret. Kubernetes command is shown in container logs.

Grafana Entrypoint: http://localhost:3000
Prometheus Entrypoint: http://localhost:9090
