/**
 * 
 */
package main;

import gui.practice.GUIApplication;

/**
 * @author Vicki
 *
 */
public class ShopTilYouDrop extends GUIApplication {
	
	/**
	 * static fields
	 */
	public static ShopTilYouDrop game;
	
	public ShopTilYouDrop() {
	}
	
	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		game = new ShopTilYouDrop();
		Thread go = new Thread(game);
	}

}
