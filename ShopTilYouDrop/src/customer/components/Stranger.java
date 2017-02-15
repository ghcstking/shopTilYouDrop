package customer.components;

import java.awt.Color;
import java.awt.Graphics2D;

import Interfaces.Victim;
import gui6.components.Component;
import gui6.components.Graphic;
import gui6.components.MovingComponent;

public class Stranger extends Graphic {
	private Victim victim;
	public Stranger(Victim victim, int x, int y, int w, int h) {
		super(x, y, w, h,"");
		this.victim= victim;
		
	}


}
