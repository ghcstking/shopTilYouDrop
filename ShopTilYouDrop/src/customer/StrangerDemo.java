/**
 * 
 */
package customer;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import gui6.GUIApplication;
import gui6.Screen;


/**
 * @author Student 6 2.0
 *
 */
public class StrangerDemo extends GUIApplication {

	/**
	 * @param width
	 * @param height
	 */
	public StrangerDemo(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see gui6.GUIApplication#initScreen()
	 */
	@Override
	public void initScreen() {
		AliStrangerDanger strangerScreen = new AliStrangerDanger(800, 500) ;
		setScreen(strangerScreen);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StrangerDemo wam = new StrangerDemo(800, 500);
		Thread game = new Thread(wam);
		game.start();
	}

}
