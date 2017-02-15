/**
 * 
 */
package customer;

import java.awt.Color;
import java.awt.Graphics2D;

import Interfaces.Victim;
import gui6.components.Component;

/**
 * @author Ali Eldeeb
 *
 */
public class DemoPlayer extends Component implements Victim {
 private String status;
	/**
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 */
	public DemoPlayer(int x, int y, int w, int h) {
		super(x, y, w, h);
		status = "Has money";
		update();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see Interfaces.Victim#rob()
	 */
	@Override
	public void rob() {
		status = "robbed";

	}

	/* (non-Javadoc)
	 * @see Interfaces.Victim#getCash()
	 */
	@Override
	public boolean getCash() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see gui6.components.Component#update(java.awt.Graphics2D)
	 */
	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLACK);
		g.drawString("player: "+status , 0, 18);

	}

}
