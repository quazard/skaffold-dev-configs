# LocalStack

Creates a LocalStack instance which emulates AWS services for local development, more information on their [Documentation website](https://docs.localstack.cloud/get-started) or their [Github repository](https://github.com/localstack/localstack).

```sh
# First time
helm repo add localstack-repo https://helm.localstack.cloud
```

```sh
skaffold dev --port-forward
```