package customer;

import java.awt.image.BufferedImage;

import gui6.components.Graphic;

/**
 * @author Daniel Quinde
 *
 */




public class Money extends Graphic {
	public static int value;
	private static BufferedImage image;
	private static String imageLoc;

	public Money(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
	}

	


	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		Money.value = value;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		Money.image = image;
	}


}