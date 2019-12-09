package com.patterns.design.singleton;

public class Singleton {

	private Singleton() {
		if (Holder.singleton != null) {
			throw new RuntimeException("cant create singleton instance. use getinstance()");
		}
		System.out.println("creating singleton obj");
	}

//	public static Singleton getInstance() {
//
//		if (singleton == null) {
//			synchronized (Singleton.class) {
//				if (singleton == null)
//					singleton = new Singleton();
//			}
//		}
//		return singleton;
//	}

	public static Singleton getInstance() {
		return Holder.singleton;
	}

	static class Holder {
		static final Singleton singleton = new Singleton();
	}
}
