# N8N

This Skaffold configuration creates one instance of N8N for automating workflows.

```sh
skaffold dev
```

N8N is accessible on port 5678, initial admin account must be created through the web interface. The instance is configured to use SQLite by default, but PostgreSQL variables can be set to use a PostgreSQL database.

Entrypoint: [http://localhost:5678](http://localhost:5678)

### References

* [N8N Github Repository](https://github.com/n8n-io/n8n)
* [N8N Documentation](https://docs.n8n.io/)
* [N8N Environment Variables](https://docs.n8n.io/hosting/configuration/environment-variables/)
* [N8N Docker Images](https://github.com/n8n-io/n8n/pkgs/container/n8n)
