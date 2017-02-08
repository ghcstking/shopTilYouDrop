package worker;

import java.util.ArrayList;

public class EdwinRequestGenerator implements VickiOrder {

	private static String[] condiments = {"top_bun", "patty", "lettuce", "tomato", "pickles",
			"cheese", "bottom bun"};
	private static ArrayList<String> request;
	
	@Override
	public int tip() {
		return 0;
	}
	
	public static void main(String[] args) {
		generate();
	}
	public static void generate() {
		request.clear();
		request.add(0, condiments[0]);
		int numberCondiments = (int) (Math.random()*3)+3;
		for (int i = 0; i < numberCondiments; i++) {
			String condiment = condiments[(int)Math.random()*condiments.length];
			request.add(condiment);
		}
		for (int i = 0; i < request.size(); i++) {
			System.out.println(request);
		}
	}
	
}
