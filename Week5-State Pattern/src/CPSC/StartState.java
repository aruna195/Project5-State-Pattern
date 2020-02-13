package CPSC;

public class StartState implements CakeState{

	public StartState() 
	{
		
		
	}

	@Override
	public void doAction(Batter batter) {
		System.out.println("Cake Ingredients are Ready");
		batter.setState(this);
		}
	public String toString() {
		return "Cake Batter is in Preperation State";
	}

}
