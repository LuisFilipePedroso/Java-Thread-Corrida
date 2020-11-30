class Run01 extends Thread {
	String car;
	Integer laps;
	String currentCar;
	
	public Run01(String car, Integer laps) {
		this.car = car;
		this.laps = laps;
	}
	
	public String getWinner() {
		return currentCar;
	}

	@Override
	public void run() {
		this.currentCar = Thread.currentThread().getName();
		
		for(int x = 0; x < this.laps; x++) {
			System.out.println(car + " " + "está ganhando" + " - Lap: " + x);
			Thread.currentThread();
			Thread.yield();
		}
	}
	
}