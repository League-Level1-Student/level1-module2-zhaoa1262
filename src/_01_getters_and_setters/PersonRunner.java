package _01_getters_and_setters;
public class PersonRunner {
	
	public static void main(String[] args) {
		Person Boe = new Person();
		Boe.setName("Bob");
		Boe.setSuperpowers("Telepathy");
		System.out.println(Boe.getName());
		System.out.println(Boe.getSuperpower());
		System.out.println(Boe.toString());
		
		Person Joe = new Person();
		Joe.setName("Joe");
		Joe.setSuperpowers("Psychokinesis");
		System.out.println(Joe.getName());
		System.out.println(Joe.getSuperpower());
		System.out.println(Joe.toString());
		
		Person Moe = new Person();
		Moe.setName("Moe");
		Moe.setSuperpowers("Pyrokinesis");
		System.out.println(Moe.getName());
		System.out.println(Moe.getSuperpower());
		System.out.println(Moe.toString());
	}
}
