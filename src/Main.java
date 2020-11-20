public class Main {
	public static void main(String[] args) {
		Integer laps = 20;
		
		Thread c1 = new Run("Gol", laps);
		Thread c2 = new Run("Corsa", laps);
		
		c1.start();
		c2.start();
		
		try {
			c1.join();
			c2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finalizou a corrida  ");
	}
}
 