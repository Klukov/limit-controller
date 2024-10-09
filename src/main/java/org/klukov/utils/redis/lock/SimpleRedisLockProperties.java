package org.klukov.utils.redis.lock;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "klukov.utils.redis.lock.simple")
public record SimpleRedisLockProperties(String redisPrefix) {}
