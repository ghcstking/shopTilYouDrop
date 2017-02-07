package customer;

import java.util.ArrayList;

public class DanielFreeMoney {

	private static MoneySpace[][] field;	
	private static ArrayList<Money> moneyAvailable;
	

	public static void main(String[] args){
		field = new MoneySpace[5][5];

	}

	
	public static void placeMoney(MoneySpace[][] area){
		double rand = Math.random();
		int r = (int) (area.length * rand);
		int c = (int) (area[0].length * rand);
		try {
			Thread.sleep((long)(2000));
			field[r][c] = moneyAvailable.get(0);
			moneyAvailable.add(new Money(50, null));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	

	}

}
