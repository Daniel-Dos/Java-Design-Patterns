package BehavioralPatterns.ObserverPattern.Demo3;

import java.util.ArrayList;
import java.util.List;

public class Subject1 implements ISubject {
	
	private int myValue;
	
	public int getMyValue() {
		return myValue;
	}
	
	public void setMyValue(int myValue) {
		this.myValue = myValue;
		// Notify observers
		notifyObservers(myValue);
	}
	
	List<IObserver> observersList = new ArrayList<IObserver>();
	
	
	@Override
	public void register(IObserver o) {
		
		observersList.add(o);

	}

	@Override
	public void unregister(IObserver o) {
		observersList.remove(o);

	}

	@Override
	public void notifyObservers(int i) {
		
		for(int j=0; j<observersList.size(); j++) {
			observersList.get(j).update(this.getClass().getSimpleName(), i);
		}

	}

}
