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
import gui6.components.TextArea;
import gui6.components.TextLabel;
import gui6.components.Visible;

public class MatthewWorkerB extends Screen implements MouseMotionListener,MouseListener{

	private Button button;
	private Button play;
	private Graphic bg;
	private Graphic white;
	private TextLabel role;
	private TextArea instructions;

	public MatthewWorkerB(int width, int height) {
		super(width, height);
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		
		bg = new Graphic(0,0,"resources/background.png");
		white = new Graphic (90, 75, "resources/white.png");
		role = new TextLabel(325, 15, 300, 100, "Worker");
		instructions = new TextArea(100, 125, 600, 400, 
				"You work at a burger place."
				+ "Make the customer's order EXACTLY as shown to earn money!");
		instructions.setSize(30);
		button = new Button(25,375,300,100,"Main Menu",Color.blue, new Action(){
			public void act(){
				MatthewChangeScreen.game.setScreen(MatthewChangeScreen.mm);
			}
		});
		play = new Button(615, 375, 100, 100, "Play", Color.blue, new Action() {
			public void act() {
				MatthewChangeScreen.game.setScreen(MatthewChangeScreen.workerGame);
			}
		});
		viewObjects.add(bg);
		viewObjects.add(white);
		viewObjects.add(role);
		viewObjects.add(instructions);
		viewObjects.add(button);
		viewObjects.add(play);
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
		if(play.isHovered(e.getX(), e.getY())){
			play.act();
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
