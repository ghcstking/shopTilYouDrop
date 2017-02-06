package customer.components;

import Interfaces.Victim;
import gui.components.MovingComponent;

public class Customer extends MovingComponent {
	
	private Victim victim;

	public Customer(Victim victim, int x, int y, int w, int h) {
		super(x, y, w, h);
		this.victim = victim;
	}
	public void setVictim(Victim v){
		this.victim = v;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void checkBehaviors(){
		if(Math.abs(victim.getX() - getX()) < 5 &&
				Math.abs(victim.getY() - getY()) < 5){
			if(victim.getCash())
			victim.rob();
		}
		
		int differenceX = victim.getX()-getX();
		int differenceY = victim.getY()-getY();
		if(differenceX >0){
			setVx(1);
		}else if(differenceX < 0){
			setVx(-1);
		}
	}

}
