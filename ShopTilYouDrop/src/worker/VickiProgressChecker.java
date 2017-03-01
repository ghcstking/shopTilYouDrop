package worker;
import java.util.ArrayList;

import worker.EdwinRequestGenerator;

public class VickiProgressChecker implements EdwinProgress {

	private static String[] condiments = {"top_bun", "patty", "lettuce", "tomato", "pickles",
			"cheese", "bottom_bun"};
	private static double[] pricesArray = {0.55, 1.50, 0.75, 0.85, 0.50, 0.95, 0.40};
	
	public VickiProgressChecker(){
		
	}

	public static boolean checkBurger(ArrayList<String> order, ArrayList<String> product) {
		if (order.size() == product.size()) {
			for (int i = 0; i < order.size(); i++) {
				if (order.get(i).equals(product.get(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public double price(ArrayList<String> order) {
		double price = 0;
		for (int i = 0; i < order.size(); i++) {
			price += pricesArray[java.util.Arrays.asList(condiments).indexOf(order.get(i))];
		}
		return price;
	}

}
