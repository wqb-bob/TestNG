package test;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisTest {
	
	
	public static void main(String[] args) {
		getJedis1();
	}
	
	public static void getJedis1(){
		Jedis jedis = new Jedis("192.168.5.7",6379);
		jedis.set("age", "100");
		System.out.println(jedis.get("age"));
		jedis.close();
	}
	
	public static void getJedis2(){
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxTotal(30);
		JedisPool jedisPool = new JedisPool(jedisPoolConfig,"localhost",6379);
		Jedis jedis = jedisPool.getResource();
		jedis.set("ds", "666");
		System.out.println(jedis.get("ds"));
		jedis.close();
	}
}
