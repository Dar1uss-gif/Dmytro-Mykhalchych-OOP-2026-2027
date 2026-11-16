class Transport {
	protected float speed;
}

class Auto extends Transport {
	private String model;
 
	Auto (float speed, String model) {
		this.speed = speed;
		this.model = model;
		System.out.println("Швидкість: " + speed + ", модель - " + model);
	}
}

public class Main {

	public static void main(String[] args) {
		Auto bmw = new Auto(250.5f, "X3M");
		Auto mercedes = new Auto(270f, "C63 AMG");
	}
}