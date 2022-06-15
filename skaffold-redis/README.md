# Redis and RedisInsight

This Skaffold configuration creates one instance of Redis and [RedisInsight](https://redis.com/redis-enterprise/redis-insight/) to visualize or browse Redis instance content.

```sh
skaffold dev --port-forward
```

RedisInsight is accessible on port 8001 and Redis instance through port 6379.