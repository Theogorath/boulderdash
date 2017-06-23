package view;

import java.awt.Graphics;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.IModel;
/**
 * <h1>The Panel Class</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */

@SuppressWarnings("serial")
public class Panel extends JPanel implements Observer {
	
	IModel model;
	
	public Panel(IModel model){
		this.model = model;
	}
	
	public void paintComponent(Graphics g){
		for(int i = 1; i <= 22; i++){
			for(int j = 1; j <= 40; j++){
				g.drawImage(model.getMap().getTable()[j][i].getImage(), 16*i+16, 16*j+16, this);
				
			}
		}
		
	}
	
	
	/**
	 *A method to update the observable
	 *
	 * @param o
     *            Observable object
     * @param arg
     * 			  Argument to notify the observer
	 */
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}