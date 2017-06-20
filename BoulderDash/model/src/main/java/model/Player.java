package model;

import java.awt.Point;

import controller.IController;

import java.awt.event.KeyEvent;
public class Player extends Character implements IController {
	Point playerPosition;

	public void Movement(KeyEvent e) {
		Point p = playerPosition.getLocation();
		switch (e.getKeyCode()){
			case KeyEvent.VK_RIGHT:
				playerPosition.setLocation(p.x+1, p.y);
				break;
			case KeyEvent.VK_LEFT:
				playerPosition.setLocation(p.x-1, p.y);
				break;
			case KeyEvent.VK_UP:
				playerPosition.setLocation(p.x, p.y-1);
				break;
			case KeyEvent.VK_DOWN:
				playerPosition.setLocation(p.x, p.y+1);
				break;}}

}
