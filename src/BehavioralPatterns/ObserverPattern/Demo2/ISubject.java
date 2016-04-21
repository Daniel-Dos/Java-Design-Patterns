package BehavioralPatterns.ObserverPattern.Demo2;

public interface ISubject {
	void register(IObserver o);
	void unregister(IObserver o);
	void notifyObservers(int updatedValue);

}
