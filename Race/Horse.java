package Race;
public class Horse implements Runnable {
	// class variables
	private String name;
	private FinishingLine f;
	private int distance;

	// Constructor
	public Horse(String name, FinishingLine f, int distance) {
		this.name = name;
		this.f = f;
		this.distance = distance;

	}

	@Override
	public void run() {
		try {
			// while loop that check in what place the horse
			while (this.distance > 0) {
				Thread.sleep(1000);
				this.distance -= (int) (Math.random() * 20 + 1);
				if (this.distance <= 0) {
					this.f.arrive(this);
				} else {
					System.out.println(this.name + ":\t" + this.distance + " meters to finish");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Get Horse name
	public String getHorseName() {
		return this.name;
	}

}
