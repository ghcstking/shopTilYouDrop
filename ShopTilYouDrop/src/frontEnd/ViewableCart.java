/**
 * 
 */
package frontEnd;

import java.awt.Color;
import java.awt.Graphics2D;

import customer.StoreItem;
import gui6.components.Component;

/**
 * @author Sammyajit Kapuria, Ryan Situ
 *
 */
public class ViewableCart extends Component {

	
	
	/**
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 */
	
	private CartInterface cart;
	public ViewableCart(int x, int y, CartInterface cart) {
		super(x, y, 800, 200);
		this.cart=cart;
	}

	/* (non-Javadoc)
	 * @see gui6.components.Component#update(java.awt.Graphics2D)
	 */
	@Override
	public void update(Graphics2D g) {
//		g.setColor(Color.black);
//		g.fillRect(0,0,getWidth(),getHeight());
		
	}


	public void addItem(StoreItem i) {
		this.cart.addItem(i);
		
	}
	
	public void removeItem(StoreItem i){
		this.cart.removeItem(i);
	}

}
