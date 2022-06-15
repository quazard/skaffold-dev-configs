# Prometheus and Grafana

Spins up 1 instance of Prometheus and Grafana. Connection between both is not configured by default so it has to be created manually.

```sh
skaffold dev --port-forward
```

Grafana UI is accessible on port 3000 and Prometheus on port 9090.