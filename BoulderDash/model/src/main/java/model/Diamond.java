package model;

import java.awt.Point;

import view.ShowSprite;

/**
 * <h1>The Class Diamond</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */
public class Diamond extends GravityElement{
	Map mapLevel = new Map();

	public Diamond(int id, Point position) {
		super(id, position);
	}
}
