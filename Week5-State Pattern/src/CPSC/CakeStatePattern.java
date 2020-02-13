package CPSC;

public class CakeStatePattern {

	public static void main(String[] args) {
		Batter batter= new Batter();
		
		StartState startState = new StartState();
		startState.doAction(batter);
		
		System.out.println(batter.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(batter);
		
		System.out.println(batter.getState().toString());	
		
	}

}
