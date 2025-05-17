# Hashicorp Vault

Creates a Hashicorp Vault instance for local development, more information on their [Documentation website](https://www.vaultproject.io/docs) or their [Github repository](https://github.com/hashicorp/vault).

```sh
# First time
helm repo add hashicorp https://helm.releases.hashicorp.com
```

```sh
skaffold dev
```

Hashicorp Vault UI is accessible on port 30001. Instance is configured in development mode and token is displayed in container logs.

Entrypoint: [http://localhost:30001](http://localhost:30001)
