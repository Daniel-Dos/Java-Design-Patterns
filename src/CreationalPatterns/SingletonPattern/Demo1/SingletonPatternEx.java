package CreationalPatterns.SingletonPattern.Demo1;

public class SingletonPatternEx {
	public static void main(String[] args) {
		
		System.out.println("****Singleton Pattern Demo***\n");
		System.out.println("Trying to make a captain for our team");
		MakeACaptain c1 = MakeACaptain.getCaptain();
		System.out.println("Trying to make another captain for our team");
		MakeACaptain c2 = MakeACaptain.getCaptain();
		
		if(c1 == c2) {
			System.out.println("C1 and c2 are same instance");
		}
	}

}
