package com.ly.mybatis.cache;

import org.apache.ibatis.cache.Cache;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * @author Administrator
 * @date 2019/1/8 10:54
 */
public class CustomMybatisCache implements Cache {

    private String id;

    private JedisPool jedisPool;

    private JedisCluster jedisCluster;

    public CustomMybatisCache(String id) {
        this.id = id;
    }

    public CustomMybatisCache(String id, JedisPool jedisPool) {
        this.id = id;
        this.jedisPool = jedisPool;
    }

    public CustomMybatisCache(String id, JedisCluster jedisCluster) {
        this.id = id;
        this.jedisCluster = jedisCluster;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void putObject(Object o, Object o1) {

    }

    @Override
    public Object getObject(Object o) {
        return null;
    }

    @Override
    public Object removeObject(Object o) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return null;
    }
}
