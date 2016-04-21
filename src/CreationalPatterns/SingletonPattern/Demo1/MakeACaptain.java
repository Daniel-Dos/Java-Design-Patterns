package CreationalPatterns.SingletonPattern.Demo1;

public class MakeACaptain {

	private static MakeACaptain _captain;
	// We make the construtor private to prevent the use of "new"
	private MakeACaptain() {}
	
	public static MakeACaptain getCaptain() {
		
		// Lazy Initialization
		if(_captain == null) {
			_captain = new MakeACaptain();
			System.out.println("New Captain Selected for our team");
		} else {
			System.out.println("You already have a Captain for your team.");
			System.out.println("Send him for the toss.");
		}
		return _captain;
	}
}
