package worker;

import java.util.ArrayList;

public class EdwinRequestGenerator implements VickiOrder {

	private static String[] condiments = {"top_bun", "patty", "lettuce", "tomato", "pickles",
			"cheese", "bottom_bun"};
	private static double[] pricesArray = {0.55, 1.50, 0.75, 0.85, 0.50, 0.95, 0.40};
	
	public EdwinRequestGenerator(){
		double tip = tip();
	}
	@Override
	public double tip() {
		double tip = (Math.random()*10);
		return tip;
	}
	
	@Override
	public ArrayList<String> generate(WorkerInterface w) {
		ArrayList<String> request = new ArrayList<String>();
		request.add(0, condiments[0]);
		int numberCondiments = (int) (Math.random()*3)+3;
		for (int i = 0; i < numberCondiments; i++) {
			String condiment = condiments[(int)(Math.random()*condiments.length)];
			while(condiment == "top_bun" || condiment == "bottom_bun"){
				condiment = condiments[(int)(Math.random()*condiments.length)];
			}
			request.add(condiment);
		}
		request.add(condiments[condiments.length-1]);
		w.displayNewRequest(request);
		return request;
	}
	
//	public static void main(String[] args) {
//		generate();
//	}
//	
//	public static void generate() {
//		ArrayList<String> request = new ArrayList<String>();
//		request.add(0, condiments[0]);
//		int numberCondiments = (int) (Math.random()*3)+3;
//		for (int i = 0; i < numberCondiments; i++) {
//			String condiment = condiments[(int)(Math.random()*condiments.length)];
//			while(condiment == "top_bun" || condiment == "bottom_bun"){
//				condiment = condiments[(int)(Math.random()*condiments.length)];
//			}
//			request.add(condiment);
//		}
//		request.add(condiments[condiments.length-1]);
//		//w.displayNewRequest(request);
//		//System.out.println(price(request));
//		for (int i = 0; i < request.size(); i++) {
//			System.out.println(request.get(i));
//		}
//	}
}
