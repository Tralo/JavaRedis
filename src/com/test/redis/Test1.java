package com.test.redis;

import redis.clients.jedis.Jedis;

/**
 * 连接 redis服务器
 */
public class Test1 {
	
	public static void main(String[] args) {
		//连接本地的 Redis 服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server successfully");
		//查看服务是否运行
		System.out.println("Server is running: " + jedis.ping());
	}

}
