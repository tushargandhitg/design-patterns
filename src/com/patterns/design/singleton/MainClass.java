package com.patterns.design.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

	public static void main(String sp[]) throws Exception {

		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		threadPool.submit(MainClass::useSingleton);
		threadPool.submit(MainClass::useSingleton);
		
		threadPool.shutdown();
	}

	static void useSingleton() {
		Singleton singleton = Singleton.getInstance();
		print("thread", singleton);
	}
	
	static void print(String name, Singleton singleton) {
		System.out.println("name: " + name + "hashcode: " + singleton.hashCode());
	}

}
