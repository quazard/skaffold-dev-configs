# Pocketbase

Configuration to spin up a Pocketbase instance locally, more information on what Pocketbase is on their [documentation site](https://pocketbase.io/docs). Given that there is no official Docker image yet, a Dockerfile is included with [latest released version](https://github.com/pocketbase/pocketbase/releases).

```sh
# First time, create Docker image (there is no official image as of now)
docker build -t pocketbase:v0.11.2 .
```

```sh
skaffold dev
```


### References

* [Pocketbase Dockerfile Repo](https://github.com/bscott/pocketbase-docker) Sample reference due to lack of official image