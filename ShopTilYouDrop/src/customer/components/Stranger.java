package customer.components;

import Interfaces.Victim;
import gui6.components.Graphic;

public class Stranger extends Graphic {
	private Victim victim;
	public Stranger(Victim victim, int x, int y, int w, int h) {
		super(x, y, w, h,"resources/Strangerr.png");
		this.victim= victim;
		
	}


}
