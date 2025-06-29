# MinIO

Create a MinIO instance for local development.

- [MinIO Documentation](https://min.io/docs/minio/kubernetes/upstream/operations/installation.html) - Official documentation for MinIO, the open source object storage system

```sh
skaffold dev
```

For endpoint access, look for exposed `minio-console` service NodePort in local kubernetes cluster. i.e. localhost:32041

Credentials:
- username: minio
- password: minio123
