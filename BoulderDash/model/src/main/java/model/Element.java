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
	private Point position;
	private BufferedImage image;
	
	public Element(int id, Point position){
		this.id = id;
		this.position = position;
		
	}
	
	public BufferedImage getImage() {
		return image;
	}

	public synchronized void setImage(BufferedImage image) {
		this.image = image;
	}

	public synchronized Point getPosition() {
		return position;
	}
	
	public synchronized void setPosition(Point position) {
		this.position = position;
	}
	
	public synchronized int getId() {
		return this.id;
	}
	
	
	
}
