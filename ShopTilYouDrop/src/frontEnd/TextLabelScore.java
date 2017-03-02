package frontEnd;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import gui6.components.Component;

public class TextLabelScore extends Component{

	private static final int WIDTH = 50;
	private static final int HEIGHT = 50;
	private String user;
	private double score;
	private String font;
	private int size;

	public TextLabelScore(int x, int y, int w, int h, String text) {
		super(0, 0, WIDTH, HEIGHT);
	}

	
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
		update();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
		update();
	}

	public void update(Graphics2D g) {
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.setFont(new Font(font,Font.BOLD|Font.ITALIC,size));
		if(user != null) g.drawString(user, 4, getHeight()-5);
	}	


}
