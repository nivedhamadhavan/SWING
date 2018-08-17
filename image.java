import java.awt.Dimension; 

import java.awt.Graphics; 

import java.awt.Image;

import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JPanel; 

public class Test extends JFrame {

	public static void main(String args[]) {

		new Test().start(); } 



public void start() { 

	ImageImplement panel = new ImageImplement(new ImageIcon("baby.jpg").getImage());

	add(panel); 

	setVisible(true); 

	setSize(400,400); 

	setDefaultCloseOperation(EXIT_ON_CLOSE); } } 

	class ImageImplement extends JPanel {

		private Image img;

		

	public ImageImplement(Image img) { 

		this.img = img;

		Dimension size = new Dimension(img.getWidth(null), img.getHeight(null)); 

		setPreferredSize(size); setMinimumSize(size); 

		setMaximumSize(size);

		setSize(size);

		setLayout(null); }

	public void paintComponent(Graphics g) {

		g.drawImage(img, 0, 0, null); } } 









