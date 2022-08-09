
public class App {

	public static void main(String[] args) {
		System.out.println("Hello git");
		

		String[] names = {"Bilbo", "Frodo", "Aragorn", "Legolas", "Gandalf", "Boromir", "Faramir"};
		
		//print greetings to fine falks in Midde Earth
		for (String name:names) {
			System.out.format("Hello, %s!\n", name);
			System.out.println("What are you doing today");
		}
		

	}

}
