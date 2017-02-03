/**
 * 
 */
package main;

import frontEnd.IramWorkerScreen;
import frontEnd.SammyajitCustomerScreen;
import gui6.GUIApplication;
import frontEnd.MatthewMain;

/**
 * @author Vicki
 *
 */
public class ShopTilYouDrop extends GUIApplication {
	
	/**
	 * static fields
	 */
	public static ShopTilYouDrop game;
	public static MatthewMain main;
	public static IramWorkerScreen worker;
	public static SammyajitCustomerScreen customer;
	
	public ShopTilYouDrop(int width,int height) {
		super(width,height);
	}
	
	public static void main(String[] args) {
		game = new ShopTilYouDrop(800,700);
		Thread go = new Thread(game);
	}


	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		
	}

}
