package customer;

import java.util.ArrayList;

public class DanielFreeMoney {

	private static MoneySpace[][] field;	
	private static ArrayList<Money> moneyAvailable;
	private static int[] values;
	

	public static void main(String[] args){
		field = new MoneySpace[5][5];
		int[] values = {5,10,20,50,100};

	}

	
	public static void placeMoney(MoneySpace[][] area){
		double rand = Math.random();
		int newValue = (int) (values.length * rand);
		int r = (int) (area.length * rand);
		int c = (int) (area[0].length * rand);
		try {
			Thread.sleep((long)(2000));
			field[r][c] = moneyAvailable.get(0);
			moneyAvailable.remove(0);
			moneyAvailable.add(new Money(values[newValue], null));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	

	}

}
