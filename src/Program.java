
public class Program {
	public static Person person; // reference to the Person class
	public static void main(String[] args) {
		System.out.println("Program Started...");

		person = new Person(46);
		
		person.setName("Tom");
		
		System.out.println(person.getName());
		
		person.runs();
		
	}

}
