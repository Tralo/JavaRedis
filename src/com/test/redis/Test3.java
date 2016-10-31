package com.test.redis;

import java.util.List;

import redis.clients.jedis.Jedis;

/**
 * Java 操作 List 实例
 */
public class Test3 {

	public static void main(String[] args) {
		//连接本地的 Redis 服务
		Jedis jedis = new Jedis("localhost");
		//存储数据到list中
		jedis.lpush("list11", "aa","bb","cc","bb","ee","ff");/*
		jedis.rpush("list00", "aa","bb","cc","bb","ee","ff");*/
		List<String> list01 = jedis.lrange("list11", 0, -1);
		List<String> list02 = jedis.lrange("list02", 0, -1);
		System.out.println("list01:  " + list01);
		System.out.println("list02:  " + list02);
		
	}
	
}
