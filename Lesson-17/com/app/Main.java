package Lesson-17.com.app;

class Auto {
 String model;

	class Engine {
		private boolean working = false;

		public void work () {
			working = true;
			System.out.print("Двигун запущено!");
		}
	}

	Engine en = new Engine();
}

public class Main {

	public static void main(String[] args) {
		Auto bmw = new Auto();
		bmw.en.work();
	}
}