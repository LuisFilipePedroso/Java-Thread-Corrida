public class Main {
	public static void main(String[] args) {
		Integer laps = 20;
		
		Thread c1 = new RunNotSync("Gol", laps);
		Thread c2 = new RunNotSync("Corsa", laps);
		Thread c3 = new RunNotSync("Palio", laps);
		Thread c4 = new RunNotSync("Fusca", laps);
		Thread c5 = new RunNotSync("Onyx", laps);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		
		try {
			c1.join();
			c2.join();
			c3.join();
			c4.join();
			c5.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finalizou a corrida  ");
	}
}
 