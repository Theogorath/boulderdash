package view;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

/**
 * <h1>The Panel Class</h1>
 *
 * @author Hugo, Th�o, Eva and Geoffrey
 * @version 1.0
 */

public class Panel extends JPanel implements Observer {
	
	public Panel(){

		
		
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