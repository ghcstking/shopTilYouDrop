package customer;

import java.util.ArrayList;

import frontEnd.SammyajitCustomerScreen;

public class DanielFreeMoney {

	private static ArrayList<Money> moneyAvailable;
	private static int[] values;
	private static SammyajitCustomerScreen game;

	public static void main(String[] args){
		placeMoney();
	}

	public static void placeMoney(){
		game = new SammyajitCustomerScreen(100, 100);
		moneyAvailable = new ArrayList<Money>();
		int[] values = {5,5,5,5,5,10,10,10,10,20,20,20,50,50,100};
		int time = 5;			
		while(time >0){
			try {
				double rand = Math.random();
				double rand1 = Math.random();
				int x = (int) ((double)game.getWidth() * rand);
				int y = (int) ((double)game.getHeight() * rand1);
				int newValue = (int) (values.length * rand);
				Money newMon = new Money( x, y, 10, 10, "coin.png");		
				newMon.setValue(values[newValue]);
				moneyAvailable.add(newMon);
				System.out.println(" X: " + moneyAvailable.get(0).getX() + " Y:  " + moneyAvailable.get(0).getY()+" Value: " + moneyAvailable.get(0).getValue());
				Thread.sleep((long)(5000));
				if(moneyAvailable.get(0) != null){
					moneyAvailable.remove(0);
				}
				time--;
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
	}
}
