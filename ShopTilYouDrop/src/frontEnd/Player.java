package frontEnd;

import java.awt.image.BufferedImage;

public class Player implements HighScoreInterface {

	private String user = "";
    private double score = 0;
	
	public Player(String user, double score) {
		this.user = user;
		this.score = score; 
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void setUsername(String user) {
		this.user = user;
		update();
	}
	
	public String getUsername() {
		return user;
	}

	public void setScore(double score) {
		this.score = score;
		update();
	}

	public double getScore() {
		return this.score;
	}

}
