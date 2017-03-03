package customer;

import java.util.ArrayList;

import frontEnd.CartInterface;
import frontEnd.ViewableCart;
import gui6.components.ClickableGraphic;
import gui6.components.Component;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;

public class RyanCart implements CartInterface{

	public static ArrayList<String> shoppingCart;
	private int numberOfItems;
	private double timeLeft;
	private double budget;
	
	public RyanCart(int x, int y) {
		super();	
		shoppingCart = new ArrayList<String>();
	}
	
	private void generateBudget(){
		budget = 4000.00;
	}
	
	private boolean areYouBroke(){
		if(budget <= 0){
			return true;
		}
		return false;
	}
	
	private static boolean isEmpty(){
		if(shoppingCart.size() == 0){
			return true;
		}
		return false;
	}

	public ArrayList<String> getCartItems() {
		return shoppingCart;
	}

	@Override
	public void addItem(StoreItem i) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void addToCart(ViewableCart c, StoreItem s) {
		c.addItem(s);
		shoppingCart.add(s.getDescription());
		c.update();
		System.out.println(shoppingCart);
	}
	
	public static void removeFromCart(ViewableCart c, String s){
		if(!isEmpty()){
		//c.removeItem(s);
		shoppingCart.remove(s);
		c.update();
		System.out.println(shoppingCart);
	
		
	}
	}
	
	public static void changeText(TextLabel a, String string) {
		a.setText(string);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

	public void removeItem(String s) {
		// TODO Auto-generated method stub
		
	}

	
	
}
