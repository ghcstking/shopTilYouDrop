/**
 * 
 */
package frontEnd;

import java.awt.Color;
import java.awt.Graphics2D;

import customer.components.Stranger;
import gui6.components.Clickable;
import gui6.components.Component;

/**
 * @author Sammy
 *
 */
public abstract class ClickSpace extends Component implements Clickable {

	private Stranger stranger;

	/**
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 */
	public ClickSpace(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see gui6.components.Clickable#isHovered(int, int)
	 */
	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return x>getX() && x<getX()+getWidth() && y > getY() && y<getY()+getHeight();
	}


	/* (non-Javadoc)
	 * @see gui6.components.Clickable#act()
	 */
	public abstract void actOnClick();

	public void act(){
		//code for doing something with the stranger happens here
		//stranger.
		actOnClick();
	}



	/* (non-Javadoc)
	 * @see gui6.components.Component#update(java.awt.Graphics2D)
	 */
	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.red);
		g.drawRect(0, 0, getWidth()-1, getHeight()-1);
	}

	public void setStranger(Stranger s) {
		this.stranger = s;
		
	}

}
