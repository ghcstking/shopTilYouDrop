/**
 * 
 */
package main;

import gui6.GUIApplication;

/**
 * @author Vicki
 *
 */
public class ShopTilYouDrop extends GUIApplication {
	/**
	 * static fields
	 */
	public static ShopTilYouDrop game;
	public ShopTilYouDrop(int i, int j) {
		super(i,j);
			
		
	}
	
	@Override
	public void initScreen() {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		game = new ShopTilYouDrop(800, 700);
		Thread go = new Thread(game);
	}

}
