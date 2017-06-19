package model;

import java.awt.Point;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.KeyEvent;

public class Rockford extends Character implements IModel {
	Point rockford;

	public void Movement(KeyEvent e) {
		Point p = rockford.getLocation();
		switch (e.getKeyCode()){
			case KeyEvent.VK_RIGHT:
				rockford.setLocation(p.x+1, p.y);
				break;
			case KeyEvent.VK_LEFT:
				rockford.setLocation(p.x-1, p.y);
				break;
			case KeyEvent.VK_UP:
				rockford.setLocation(p.x, p.y-1);
				break;
			case KeyEvent.VK_DOWN:
				rockford.setLocation(p.x, p.y+1);
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
