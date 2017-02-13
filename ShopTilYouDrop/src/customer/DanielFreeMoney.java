package customer;

import java.util.ArrayList;

import frontEnd.SammyajitCustomerScreen;

public class DanielFreeMoney implements MoneySpace {

	private static ArrayList<Money> moneyAvailable;
	private static int[] values;
	private static int x;
	private static int y;


	public static void main(String[] args){
		int[] values = {5,10,20,50,100};

	}

	
	public static int getX() {
		return x;
	}


	public static void setX(int x) {
		DanielFreeMoney.x = x;
	}


	public static int getY() {
		return y;
	}


	public static void setY(int y) {
		DanielFreeMoney.y = y;
	}


	public static void placeMoney(MoneySpace[][] area){
		double rand = Math.random();
		int newValue = (int) (values.length * rand);
		try {
			Thread.sleep((long)(2000));
			moneyAvailable.remove(0);
			Money newMon = new Money( x, y, 10, 10, " ");
			newMon.setValue(values[newValue]);
			moneyAvailable.add(newMon);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		
		
	

	}

}
