package frontEnd;

import frontEnd.MatthewMain;
import gui6.GUIApplication;
import frontEnd.MatthewCustomerB;
import frontEnd.MatthewWorkerB;

public class MatthewChangeScreen extends GUIApplication {

	public MatthewChangeScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public static MatthewMain mm;
	public static MatthewChangeScreen game;//only one exists (no one plays three of the same game at the same time)
	public static MatthewCustomerB customerScreen;
	public static MatthewWorkerB workerScreen;

	@Override
	public void initScreen() {
		mm = new MatthewMain(getWidth(), getHeight());
		setScreen(mm);
		customerScreen = new MatthewCustomerB(getWidth(), getHeight());
		workerScreen = new MatthewWorkerB(getWidth(), getHeight());
	}
	public static void main(String[] args){
		game = new MatthewChangeScreen(800,600);
		Thread app = new Thread(game);
		app.start();
	}
}
