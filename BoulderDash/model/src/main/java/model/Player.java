package model;

import java.awt.Point;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.KeyEvent;

public class Player extends Character implements IModel {
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

	@Override
	public Example getExampleById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Example getExampleByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Example> getAllExamples() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}
