package com.sdlab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class JButtonClass {
	public void showWindow()
	{ 
	    JFrame f=new JFrame("Button Example");  
	    final JTextField tf=new JTextField();  
	    tf.setBounds(50,50, 150,20);  
//	    JButton b=new JButton("Click Here"); // Button with text
	    JButton b=new JButton(new ImageIcon("D:\\eclipse\\swing01\\images\\register_icon.jpg"));// button with image  
	    b.setBounds(50,100,95,30);  
	    b.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            tf.setText("Welcome to Javatpoint.");  
	        }  
	    });  
	    f.add(b);f.add(tf);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	}  
}
