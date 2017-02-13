package customer;

import java.util.ArrayList;

import frontEnd.SammyajitCustomerScreen;

public class DanielFreeMoney {

	private static ArrayList<Money> moneyAvailable;
	private static int[] values;

	public static void main(String[] args){
		int[] values = {5,10,20,50,100};

	}

	public static void placeMoney(SammyajitCustomerScreen screen){
		double rand = Math.random();
		int newValue = (int) (values.length * rand);
		int x = (int) ((double)screen.getWidth() * rand);
		int y = (int) ((double)screen.getHeight() * rand);

		try {
			Money newMon = new Money( x, y, 10, 10, "coin.png");		
			newMon.setValue(values[newValue]);
			moneyAvailable.add(newMon);
			Thread.sleep((long)(2000));
			moneyAvailable.remove(0);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
	 
		
	

	}

	
	
}
