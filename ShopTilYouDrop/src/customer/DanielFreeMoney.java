package customer;

import java.util.ArrayList;

public class DanielFreeMoney {

	private static MoneySpace[][] field;	
	private static ArrayList<Money> moneyAvailable;
	

	public static void main(String[] args){
		field = new MoneySpace[5][5];
		moneyAvailable.add(new Money(50, null));

	}

	
	public static void placeMoney(MoneySpace[][] area){
		double rand = Math.random();
		int r = (int) (area.length * rand);
		int c = (int) (area[0].length * rand);
		
		// check for contents of cell 
	

	}

}
