class Pitstop {
	
	public void run(String car) {
		long number = (long) (Math.random() * 1000) + 100;
		
		System.out.println(car + " parou no Pitstop por " + number + " milisegundos");
		
		try {
			Thread.sleep(number);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}