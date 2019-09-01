package _03_smurf;

public class HandySmurf {

	public static void main(String[] args) {
		Smurf HandySmurf = new Smurf("Handy Smurf");
		HandySmurf.getName();
		HandySmurf.eat();
		
		Smurf PapaSmurf = new Smurf("Papa Smurf");
		PapaSmurf.getName();
		PapaSmurf.eat();
		System.out.println(PapaSmurf.getName() + ", I am wearing a" + PapaSmurf.getHatColor() + " hat, and I am a" + PapaSmurf.isGirlOrBoy());
		
		Smurf Smurfette = new Smurf("Smurfette");
		Smurfette.getName();
		Smurfette.eat();
		System.out.println(Smurfette.getName() +  ", I am wearing a" + Smurfette.getHatColor() + " hat, and I am a" + Smurfette.isGirlOrBoy());
		}
}
