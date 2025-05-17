# Redis and RedisInsight

This Skaffold configuration creates one instance of Redis and [RedisInsight](https://redis.io/docs/latest/operate/redisinsight/install/) to visualize or browse Redis instance content.

```sh
skaffold dev
```

RedisInsight is accessible on port 5540 and Redis instance through port 6379.

Entrypoint: [http://localhost:5540](http://localhost:5540)