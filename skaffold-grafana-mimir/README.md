# Grafana Mimir

Create a Grafana Mimir instance for local development.

```sh
skaffold dev
```

Service is dependant on MinIO instance (or any S3 compatible storage). Enable it through Helm Chart values file or use [MinIO skaffold](https://github.com/quazard/skaffold-minio) repository.

### References

* [Grafana Mimir Documentation](https://grafana.com/docs/mimir/latest/?pg=oss-mimir&plcmt=resources)
* [Grafana Mimir Helm Chart](https://github.com/grafana/mimir/tree/main/operations/helm/charts/mimir-distributed)
