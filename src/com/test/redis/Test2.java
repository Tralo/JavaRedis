package com.test.redis;

import redis.clients.jedis.Jedis;

/**
 * 操作 redist 的 string 实例
 */
public class Test2 {
	
	public static void main(String[] args) {
		//连接本地的 Redis 服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server successfully");
		//设置字符串数据
		jedis.set("username", "Tom");
		jedis.set("password", "123456");
		//获取存储的数据并输出
		System.out.println("Store strings in redis: " + jedis.get("username") + "    " + jedis.get("password")) ;
	}

}
