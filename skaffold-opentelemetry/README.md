# Skaffold OpenTelemetry

This Skaffold configuration creates one instance of OpenTelemetry for tracing and metrics.

```sh
helm repo add open-telemetry https://open-telemetry.github.io/opentelemetry-helm-charts
helm search repo open-telemetry
```

```sh
skaffold dev
```

### References

* [OpenTelemetry Github Repository](https://github.com/open-telemetry/opentelemetry-helm-charts)
* [OpenTelemetry Documentation](https://opentelemetry.io/docs/)
