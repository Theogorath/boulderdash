package model;

import java.awt.Point;
import view.IshowSprite;
import view.ShowSprite;

import controller.IController;

import java.awt.event.KeyEvent;
/**
 * <h1>The Class Player</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */
public class Player extends Character implements IController {
	Point playerPosition;
	/**
	 * Move the player in the map
	 * 
	 * @param e
	 *            This event occurs when a key press is followed by a key release       
	 */
	public void Movement(KeyEvent e) {
		Point p = playerPosition.getLocation();
		switch (e.getKeyCode()){
		case KeyEvent.VK_RIGHT:
			if(mapLevel[p.x+1][p.y] != 2){
				playerPosition.setLocation(p.x+1, p.y);
				new ShowSprite(2,48,64); 
				Thread.sleep(100);
				new ShowSprite(2,16,16);
			}

			break;
		case KeyEvent.VK_LEFT:
			if(mapLevel[p.x-1][p.y] != 2){
				playerPosition.setLocation(p.x-1, p.y);
				new ShowSprite(2,48,32); 
				Thread.sleep(100);
				new ShowSprite(2,16,16);
			}
			break;
		case KeyEvent.VK_UP:
			if(mapLevel[p.x][p.y-1] != 2 && mapLevel[p.x][p.y-1] != 3){
				playerPosition.setLocation(p.x, p.y-1);
				new ShowSprite(2,32,48); 
				Thread.sleep(100);
				new ShowSprite(2,16,16);
			}
			break;
		case KeyEvent.VK_DOWN:
			if(mapLevel[p.x][p.y+1] != 2 && mapLevel[p.x][p.y+1] != 3){
				playerPosition.setLocation(p.x, p.y-1);
				new ShowSprite(2,32,80); 
				Thread.sleep(100);
				new ShowSprite(2,16,16);
			}
			break;
		}

	}



}
