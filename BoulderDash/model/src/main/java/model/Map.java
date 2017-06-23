package model;

import java.awt.Point;

import model.dao.Connection;

public class Map {
	private Element[][] mapLevel;
	static private int line = 22;
	static private int colomn = 40;
	static private int levelId = 1;
	
	public Map(){
		this.fillMapLevel();
	}
	
	public void fillMapLevel(){
		Connection connect = new Connection();
		this.mapLevel = new Element[line][colomn];
		int[][] table = new int[line][colomn];
		connect.getMapByLevelId(levelId, table);
		for(int i = 0; i < line; i++){
			for(int j = 0; j < colomn; j++){
				Point position = new Point(i, j);
				int id = table[i][j];
				mapLevel[i][j] = new Element(id, position);
			}	
		}
	}
	
	public void setTable(Element[][] table) {
		this.mapLevel = table;
	}

	public synchronized Element[][] getTable() {
		return mapLevel;
	}

	public synchronized static int getLine() {
		return line;
	}

	public synchronized static int getColomn() {
		return colomn;
	}
	
	public synchronized Element getValue(int a, int b){
		return mapLevel[a][b];
	}
}
