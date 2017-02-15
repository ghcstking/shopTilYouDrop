package customer;

import java.util.ArrayList;

import frontEnd.SammyajitCustomerScreen;

public class DanielFreeMoney {

	private static ArrayList<Money> moneyAvailable;
	private static int[] values;

	public static void main(String[] args){

		placeMoney();

	}

	public static void placeMoney(){
		moneyAvailable = new ArrayList<Money>();
		int[] values = {5,10,20,50,100};
		int time = 5;

		//		int x = (int) ((double)screen.getWidth() * rand);
		//		int y = (int) ((double)screen.getHeight() * rand);

		while(time >0){
			try {
				double rand = Math.random();
				int newValue = (int) (5 * rand);
				Money newMon = new Money( 0, 0, 10, 10, "coin.png");		
				newMon.setValue(values[newValue]);
				moneyAvailable.add(newMon);
				System.out.println(moneyAvailable.get(0).getValue());
				Thread.sleep((long)(2000));

				moneyAvailable.remove(0);
				time--;
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}

		}





	}



}
