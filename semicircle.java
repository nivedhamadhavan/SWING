package swing;
import javax.swing.*; 

import java.awt.*; 

public class arc extends JPanel{ 



public void paint(Graphics g){ 

 

	g.setColor(Color.GREEN); 

	g.fillArc(50, 50, 100, 100, 0, 180); 

	g.setColor(Color.yellow);
	
	g.fillArc(20, 20, 100, 100, 180, 180);



} 

public static void main(String[] args){ 

JFrame jf=new JFrame(); 

jf.setDefaultCloseOperation 

(JFrame.EXIT_ON_CLOSE); 

jf.setPreferredSize(new Dimension(300,500)); 

jf.add(new arc()); 

jf.pack(); 

jf.setVisible(true); 

} 

}

