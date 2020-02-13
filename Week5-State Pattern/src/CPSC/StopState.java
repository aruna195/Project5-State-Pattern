package CPSC;

public class StopState implements CakeState {

	public StopState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction(Batter batter) {
		System.out.println("Cake Batter is Ready");
                batter.setState(this);		
	}
	public String toString() {
		return "Next State- Bake";
	}
		
	}


