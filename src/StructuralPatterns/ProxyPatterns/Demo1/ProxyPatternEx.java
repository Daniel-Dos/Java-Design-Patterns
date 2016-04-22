package StructuralPatterns.ProxyPatterns.Demo1;

import StructuralPatterns.ProxyPatterns.ProxyClasses.Proxy;

public class ProxyPatternEx {
	public static void main(String[] args) {
		
		System.out.println("***Proxy Pattern Demo***\n");
		Proxy px = new Proxy();
		px.doSomeWork();
	}

}
