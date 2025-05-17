# Pocketbase

Configuration to spin up a Pocketbase instance locally, more information on what Pocketbase is on their [documentation site](https://pocketbase.io/docs). Given that there is no official Docker image yet, a Dockerfile is included with [latest released version](https://github.com/pocketbase/pocketbase/releases).

```sh
# First time, create Docker image (there is no official image as of now)
docker build -t pocketbase:v0.28.1 .

# Nerdctl build command
nerdctl -n k8s.io build -t pocketbase:v0.28.1 -f Dockerfile .
```

```sh
skaffold dev
```

> Look at container logs to get the setup url with a token, this is needed to complete the initial setup with a super user account.

Entrypoint: [http://localhost:8090](http://localhost:8090)


### References

* [Pocketbase Dockerfile Repo](https://github.com/bscott/pocketbase-docker) Sample reference due to lack of official image