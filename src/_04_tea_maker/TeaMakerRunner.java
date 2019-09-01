package _04_tea_maker;

public class TeaMakerRunner {

	
	public static void main(String[] args) {
		TeaBag teabag = new TeaBag("chamomile");
		Kettle kettle = new Kettle();
		Cup cup = new Cup();
		
		kettle.getWater();
		kettle.boil();
		cup.makeTea(teabag, kettle.getWater());
		
	}
}
