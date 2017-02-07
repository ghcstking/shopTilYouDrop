package customer;

import java.awt.image.BufferedImage;

public class Money {
	private static int value;
	private static BufferedImage image;
	
	public Money(int value, BufferedImage image) {
		this.value = value;
		this.image = image; 
		
		
	}

	public static int getValue() {
		return value;
	}

	public static void setValue(int value) {
		Money.value = value;
	}

	public static BufferedImage getImage() {
		return image;
	}

	public static void setImage(BufferedImage image) {
		Money.image = image;
	}
	

}
