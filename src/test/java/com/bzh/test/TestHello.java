package com.bzh.test;

import org.junit.Test;

import com.bzh.entity.Hello;

public class TestHello {
	@Test
	public void show() {
		Hello hello = new Hello();
		hello.setId(1);
		hello.setName("张三");
		System.out.println(hello);
	}
}
