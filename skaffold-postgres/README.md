# Postgres

Configuration to create a Postgres instance for local development, this does not replace the use of helm charts for heavier usage (like an entire k8s environment).


```sh
skaffold dev
```

> environment variables have a base configuration to define a db called `demodb` with username `user` and password `password`. replace these as needed.
