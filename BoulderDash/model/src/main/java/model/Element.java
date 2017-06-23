package model;
import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 * <h1>The Class Element, mother class of Static and Mobile</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */
public class Element {
	private int id;
	private int posX;
	private int posY;
	private BufferedImage image;
	
	public Element(int id, int posX, int posY){
		this.id = id;
		this.posX = posX;
		this.posY = posY;
		
	}
	
	public synchronized BufferedImage getImage() {
		return image;
	}

	public synchronized void setImage(BufferedImage image) {
		this.image = image;
	}

	public synchronized int getPositionX() {
		return posX;
	}
	
	public synchronized int getPositionY() {
		return posY;
	}
	
	public synchronized void setPosition(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	public synchronized int getId() {
		return this.id;
	}
	
	
	
}
