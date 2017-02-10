package worker;

import java.util.ArrayList;

public class EdwinRequestGenerator implements VickiOrder {

	private static String[] condiments = {"top_bun", "patty", "lettuce", "tomato", "pickles",
			"cheese", "bottom_bun"};
	private static double[] pricesArray = {0.55, 1.50, 0.75, 0.85, 0.50, 0.95, 0.40};
	private static ArrayList<String> request = new ArrayList<String>();
	
	@Override
	public double tip() {
		double tip = (Math.random()*10);
		return tip;
	}
	
	public static double price() {
		double price = 0;
		for (int i = 0; i < request.size(); i++) {
			request.get(i).
		}
		return price;
	}

	public static void main(String[] args) {
		generate();
		System.out.println(price());
	}
	public static void generate() {
		request.clear();
		request.add(0, condiments[0]);
		int numberCondiments = (int) (Math.random()*3)+3;
		for (int i = 0; i < numberCondiments; i++) {
			String condiment = condiments[(int)(Math.random()*condiments.length)];
//			while(request.contains(condiment)) {
//				condiment = condiments[(int)(Math.random()*condiments.length-1)];
//			}
			request.add(condiment);
		}
		request.add(condiments[condiments.length-1]);
		System.out.println(numberCondiments);
		for (int i = 0; i < request.size(); i++) {
			System.out.println(request.get(i));
		}
	}

	
}
