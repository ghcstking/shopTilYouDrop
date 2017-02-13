package customer;

import java.util.ArrayList;

import frontEnd.SammyajitCustomerScreen;

public class DanielFreeMoney {

	private static ArrayList<Money> moneyAvailable;
	private static int[] values;
	

	public static void main(String[] args){
		int[] values = {5,10,20,50,100};

	}

	
	public static void placeMoney(MoneySpace[][] area){
		double rand = Math.random();
		int newValue = (int) (values.length * rand);
		int r = (int) (SammyajitCustomerScreen.getX()* rand);
		int c = (int) (SammyajitCustomerScreen.getY() * rand);
		try {
			Thread.sleep((long)(2000));
			moneyAvailable.remove(0);
			Money newMon = new Money( r, c, 10, 10, " ");
			newMon.setValue(values[newValue]);
			moneyAvailable.add(newMon);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
	

	}

}
