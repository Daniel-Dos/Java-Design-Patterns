package BehavioralPatterns.ObserverPattern.Demo3;

public class ObserverPatternDemo3Ex {
	public static void main(String[] args) {
		
		System.out.println("***Observer Pattern Demo3***\n");
		Subject1 sub1 = new Subject1();
		Subject2 sub2 = new Subject2();
	
		Observer1 ob1 = new Observer1();
		Observer2 ob2 = new Observer2();
		Observer3 ob3 = new Observer3();
		
		// Observer1 and Observer2 registers to  //Subject1
		sub1.register(ob1);
		sub1.register(ob2);
		
		// Observer2 and Observer3 register to // SUbject2
		sub2.register(ob2);
		sub2.register(ob3);
		
		// set new value Subject 1
		// Observer1 and Observer2 get // notification
		sub1.setMyValue(50);
		System.out.println();
		
		// set new value Subject 2
		// Observer2 and Observer3 get // notification
		sub2.setMyValue(250);
		System.out.println();
		
		// unregister Observer2 from Subject1
		sub1.unregister(ob2);
		
		// set new value to Subject & only // Observer1 is notified
		sub1.setMyValue(550);
		System.out.println();
		
		//ob2 can still notice change in //Subject 2
		sub2.setMyValue(750);
	}

}
