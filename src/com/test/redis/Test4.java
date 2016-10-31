package com.test.redis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

/**
 * 操作 keys 实例
 */
public class Test4 {

	public static void main(String[] args) {
		//连接本地的 Redis 服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server successfully");
		//获取数据并输出
		Set<String> set = jedis.keys("*");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println("List of stored keys:: "+ it.next());
		}
	}
}
