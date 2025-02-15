# Pocket ID

This Skaffold configuration creates one instance of Pocket ID for OIDC authentication through passkeys.

```sh
skaffold dev
```

Pocket ID is accessible on port 4000 using unsecure http protocol, might not be fully functional as it requires a valid domain name with a trusted SSL certificate.

Entrypoint: [http://localhost:4000/login/setup](http://localhost:4000/login/setup)

### References

* [Pocket ID Github Repository](https://github.com/pocket-id/pocket-id?tab=readme-ov-file)
* [Pocket ID Documentation](https://pocket-id.org/docs/introduction)
* [Pocket ID Docker Images](https://github.com/pocket-id/pocket-id/pkgs/container/pocket-id)
