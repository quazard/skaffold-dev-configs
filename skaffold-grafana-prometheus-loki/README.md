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

```sh
kubectl get secret --namespace default local-grafana -o jsonpath="{.data.admin-password}" | base64 --decode ; echo
```

Grafana Entrypoint: http://localhost:3000
Prometheus Entrypoint: http://localhost:9090


## Standalone/Local

Use `*local.yaml` values files to spin up instances self-contained in a local kubernetes cluster, without external dependencies.


## Distributed/Cloud

Use `*cloud.yaml` values files to spin up instances with more than 1 instance of each component. These configurations have integration with external services such as PostgreSQL, MinIO, Grafana Mimir and OpenTelemetry. These external services are optional and can be run locally using the following repositories.

- [Grafana Mimir](https://github.com/quazard/skaffold-dev-configs/tree/main/skaffold-grafana-mimir)
- [PostgreSQL](https://github.com/quazard/skaffold-dev-configs/tree/main/skaffold-postgres)
- [MinIO](https://github.com/quazard/skaffold-dev-configs/tree/main/skaffold-minio)
- [OpenTelemetry](https://github.com/quazard/skaffold-dev-configs/tree/main/skaffold-opentelemetry)
