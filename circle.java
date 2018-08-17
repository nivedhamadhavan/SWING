package swing;
import javax.swing.*;

import java.awt.*;



public class circle extends JFrame{

     public circle(){

          setSize(400,400);

          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          setLocationRelativeTo(null);

          setVisible(true);

     }



     public static void main(String a[]){

         new circle();

     }



     public void paint(Graphics g){

          Color PURPLE=new Color(255,0,255);

          g.setColor(PURPLE);

          g.fillOval(100,100,100,100);

          g.drawOval(100, 100, 100, 100); // FOR RECT

     }

}
