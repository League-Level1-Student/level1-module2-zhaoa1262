package _01_getters_and_setters;

public class Person {
	
String name;
String superpowers;

String getName() {
	return name;
}

String getSuperpower() {
	return superpowers;
}

void setName(String name) {
	this.name = name;
}

void setSuperpowers(String superpowers) {
	this.superpowers = superpowers;
}

public String toString() {
	return ( this.name + " has mad " + this.superpowers + " skills");
	
}

	public static void main(String[] args) {
		
	}
}
