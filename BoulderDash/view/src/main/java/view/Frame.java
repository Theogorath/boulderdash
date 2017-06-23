package view;

import javax.swing.JFrame;

import model.IModel;

/**
 * <h1>The Frame Class</h1>
 *
 * @author Hugo, Th�o, Eva and Geoffrey
 * @version 1.0
 */


public class Frame extends JFrame {
	private Panel panel;
	

/**
 * Creates a new frame with a static size and a panel that has the size of the frame
 */
	public Frame(IModel model){
		this.setTitle("Window");
		this.setSize(640,480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		
		panel = new Panel(model);
		this.setContentPane(panel);
		panel.setLayout(null);
		panel.setBounds(0, 0, 640, 480);
	}
	
}