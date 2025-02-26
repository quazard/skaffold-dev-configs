# Jetbrains Youtrack

This skaffold configuration creates one instance of Jetbrains Youtrack for testing purposes.

```sh
skaffold dev
```

Youtrack is accessible on port 8080 and requires to look for a token on container logs in order to proceed with the initial setup.

Entrypoint: [http://localhost:8080](http://localhost:8080)

### References

* [Youtrack Kubernetes Setup](https://www.jetbrains.com/help/youtrack/server/deploy-youtrack-kubernetes.html)
* [Hardware requirements](https://www.jetbrains.com/help/youtrack/server/youtrack-supported-environments.html)

