package customer;

public class DanielFreeMoney {

	public static MoneySpace[][] field;	

	public static void main(String[] args){
		field = new MoneySpace[5][5];

	}

	
	public static void placeMoney(MoneySpace[][] area){
		double rand = Math.random();
		int r = (int) (area.length * rand);
		int c = (int) (area[0].length * rand);
		
		// check for contents of cell
		
		
	}

}
