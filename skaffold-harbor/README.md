# Harbor

This configuration makes use of the official Harbor Helm chart to create/configure all the necessary tools (redis, database, ui) to get a Harbor instance up an running. Configuration values defines a host name which might not be accessible without creating a self-signed certificate.

```sh
# First time
helm repo add harbor https://helm.goharbor.io
```

```sh
skaffold dev --port-forward
```

In order to push Docker images to the local registry, a self-signed certificate must be created to match the defined host name.