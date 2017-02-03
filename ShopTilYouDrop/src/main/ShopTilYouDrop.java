/**
 * 
 */
package main;

import gui6.GUIApplication;

/**
 * @author Vicki
 *
 */
public class ShopTilYouDrop extends gui6.GUIApplication {
	/**
	 * static fields
	 */
	public static ShopTilYouDrop game;
	public ShopTilYouDrop(int width, int height) {
		super(width, height);
	}
	
	public static void main(String[] args) {
		game = new ShopTilYouDrop(800, 700);
		Thread go = new Thread(game);
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		
	}

}
