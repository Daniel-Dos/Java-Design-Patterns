package BehavioralPatterns.ObserverPattern.Demo3;

public class Observer2 implements IObserver {

	@Override
	public void update(String s, int i) {
		System.out.println("Observer2: observes->myValues is changed in " +s+" to :" + i);

	}

}
