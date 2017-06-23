package view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Graphics;

import javax.swing.*;

/**
 * <h1>The Class ShowSprite</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */
public class ShowSprite extends JFrame implements IshowSprite{

	private static final long serialVersionUID = 1L;
	public int posX;
	public int posY;
	public int choice;
	
	/**
     * Show a sprite
     * 
     * @param choice
     *            Choose the sprite to use (1 -> Blocks / 2 -> Player)
     * @param posX
     * 			  Select the position X in the sprite
     * @param posY
     *			  Select the position Y in the sprite          
     */
	
	public ShowSprite(int choice, int posX, int posY){
	
		this.setTitle("test");
		this.setSize(640,480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.posX = posX;
		this.posY = posY;
		this.choice = choice;
		System.out.println("choice : " + choice);
	}
	/**
     * Show a sprite
     * 
     * @param g
     *            Graphic object to paint on a component
     */
	
	public void paint(Graphics g){
		
		BufferedImage img = null;
		BufferedImage img2 = null;
		
		
		try {
			
			if (choice == 1){
				img = ImageIO.read(new File("images/blocks.png"));
				System.out.println("choice2 : " + choice);
			}
				
		
			
			else{
				img2 = ImageIO.read(new File("images/player.png"));
			}
				
			
		
		}catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("error : " + e.getMessage());
			System.out.println("error image  width: " + img.getWidth());
			System.out.println("error image  height: " + img.getHeight());
		}
		
		g.clearRect(0, 0, 680, 540);
		
		if (choice == 1){
			
			BufferedImage subimage = img.getSubimage(posX, posY, 16, 16);
			System.out.println("okay subimage  width: " + subimage.getWidth());
			System.out.println("okay subimage  height: " + subimage.getHeight());
			g.drawImage(subimage, 50, 50, null);
		}
		
		
		else {
			
			BufferedImage subimage2 = img2.getSubimage(posX, posY, 16, 16);
			System.out.println("okay subimage2  width: " + subimage2.getWidth());
			System.out.println("okay subimage2  height: " + subimage2.getHeight());
			g.drawImage(subimage2, 100, 100, null);
			
		}
	}
	//new showSprite(1,16,0); 

}