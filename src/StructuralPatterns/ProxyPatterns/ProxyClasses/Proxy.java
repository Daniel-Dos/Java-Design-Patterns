package StructuralPatterns.ProxyPatterns.ProxyClasses;

import StructuralPatterns.ProxyPatterns.OriginalClasses.ConcreteSubject;
import StructuralPatterns.ProxyPatterns.OriginalClasses.Subject;

public class Proxy extends Subject {

	ConcreteSubject cs;
	@Override
	public void doSomeWork() {
		System.out.println("Proxy call happening now");
		// Lazy initizalization
		if(cs == null) {
			cs = new ConcreteSubject();
		}
		cs.doSomeWork();
	}

}
