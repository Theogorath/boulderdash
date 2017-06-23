package model;

import java.awt.Point;
import java.awt.event.KeyEvent;

import controller.IController;
import view.ShowSprite;
/**
 * <h1>The Class Player</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */
public class Player extends Character implements IController {

	public Player(int id, Point position) {
		super(id, position);
		// TODO Auto-generated constructor stub
	}
	Point playerPosition;
	/**
	 * Move the player in the map
	 * 
	 * @param e
	 *            This event occurs when a key press is followed by a key release       
	 */
	Map mapLevel = new Map();
	public void Movement(KeyEvent e) throws InterruptedException {
		Point p = playerPosition.getLocation();
		switch (e.getKeyCode()){
		case KeyEvent.VK_RIGHT:
			if(mapLevel.getValue(p.x+1, p.y).getId() != 2){
				playerPosition.setLocation(p.x+1, p.y);
				new ShowSprite(2,48,64, p); 
				Thread.sleep(100);
				new ShowSprite(2,16,16, p);
			}

			break;
		case KeyEvent.VK_LEFT:
			if(mapLevel.getValue(p.x-1, p.y).getId() != 2){
				playerPosition.setLocation(p.x-1, p.y);
				new ShowSprite(2,48,32, p); 
				Thread.sleep(100);
				new ShowSprite(2,16,16, p);
			}
			break;
		case KeyEvent.VK_UP:
			if(mapLevel.getValue(p.x, p.y+1).getId() != 2 && mapLevel.getValue(p.x, p.y+1).getId() != 3){
				playerPosition.setLocation(p.x, p.y+1);
				new ShowSprite(2,32,48, p); 
				Thread.sleep(100);
				new ShowSprite(2,16,16, p);
			}
			break;
		case KeyEvent.VK_DOWN:
			if(mapLevel.getValue(p.x, p.y-1).getId() != 2 && mapLevel.getValue(p.x, p.y-1).getId() != 3){
				playerPosition.setLocation(p.x, p.y-1);
				new ShowSprite(2,32,80, p); 
				Thread.sleep(100);
				new ShowSprite(2,16,16, p);
			}
			break;
		}

	}



}
