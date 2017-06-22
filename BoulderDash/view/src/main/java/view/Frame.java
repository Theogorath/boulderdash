package view;

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
	private Panel panel;
	
	public Frame(){
		this.setTitle("Window");
		this.setSize(640,480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		
		panel = new Panel();
		this.setContentPane(panel);
		panel.setLayout(null);
		panel.setVisible(true);
		JLabel label;
		label = new JLabel("text");
		panel.add(label);
		label.setBounds(10, 20, 30, 40);
		label.setVisible(true);
	}
	

	public static void main(final String[] args) {
		Frame frame = new Frame();
	}
	
}