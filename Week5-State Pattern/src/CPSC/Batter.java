package CPSC;

public class Batter {
	private CakeState state;
	

	public Batter() {
		state =null;
	}
	
	public void setState(CakeState state) {
		this.state= state;
	}
	
	public  CakeState getState() {
		return state;
	}
}


