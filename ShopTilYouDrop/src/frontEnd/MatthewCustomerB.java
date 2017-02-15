package frontEnd;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui6.Screen;
import gui6.components.Action;
import gui6.components.Button;
import gui6.components.Graphic;
import gui6.components.TextLabel;
import gui6.components.Visible;

public class MatthewCustomerB extends Screen implements MouseMotionListener,MouseListener{

	private Button button;
	private Graphic bg;
	private Graphic white;
	private TextLabel role;

	public MatthewCustomerB(int width, int height) {
		super(width, height);
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		
		bg = new Graphic(0,0,"resources/background.png");
		white = new Graphic (90, 75, "resources/white.png");
		role = new TextLabel(225, 150, 300, 100, "Customer");
		button = new Button(225,325,300,100,"Main Menu",Color.blue, new Action(){
			public void act(){
				MatthewChangeScreen.game.setScreen(MatthewChangeScreen.mm);
			}
		});
		viewObjects.add(bg);
		viewObjects.add(white);
		viewObjects.add(role);
		viewObjects.add(button);
	}

	public MouseListener getMouseListener(){
		return this;
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();//get mouse X coordinates
		int my = e.getY();//get Y coord
	}

	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
