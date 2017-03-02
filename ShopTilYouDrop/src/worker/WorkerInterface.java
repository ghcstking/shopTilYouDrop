package worker;

import java.util.ArrayList;

import gui6.components.TextLabel;

public interface WorkerInterface {
	void displayNewRequest(ArrayList<String> r);
	void displayBurger();
	void displayPrice();
	void submitBurger();
	double getScore();
}
