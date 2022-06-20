package day0527;

class Rose extends Flower {

	String name;
	int cost;
	
	Rose(String name, int cost) {
		super (name, cost);
	}
}



class Tulip extends Flower {

	String name;
	int cost;
	
	Tulip(String name, int cost) {
		super (name, cost);
	}
}



public class FlowerMain {

	public static void main(String[] args) {
		
		Rose r = new Rose("장미", 1500);
		Tulip t = new Tulip("튤립", 2000);
		
		r.flowerInfo();
		t.flowerInfo();

	}

}