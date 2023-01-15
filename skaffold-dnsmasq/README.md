# Dnsmasq

Creates a Dnsmasq instance per node in a k8s cluster, used mainly for local development where hosts have to be resolved through a domain such as `.local` or `.test` rather than localhost (by any reason). Resolver at host machine must forward to k8s cluster to resolve these domain urls.


```sh
# First time, create Docker image (there is no official image as of now)
docker build -t dnsmasq:latest .
```

Update `configmap.yaml` file which holds `dnsmasq.conf` configuration content. Then create a resolver file at host machine with below content (modify domain and nameserver accordingly):

```sh
# /etc/resolver/anyfilename

domain local
nameserver 0.0.0.0
search_order 1
timeout 5
```

Finally spin up the `dnsmasq` instance:

```sh
skaffold dev
```

### References

* [Dnsmasq on Docker](https://onthedock.github.io/post/170827-dnsmasq-en-docker/) Spanish blog post
