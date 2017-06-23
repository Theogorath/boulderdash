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
		panel.setBounds(0, 0, 640, 480);
	}
	
}