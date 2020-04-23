package singleton.example1;

public class Singleton {
	private static Singleton uniqueInstance;
	
	public static Singleton getInstance() {
		if (uniqueInstance  == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
