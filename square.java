package swing;
import javax.swing.*;

import java.awt.*;



public class square extends JFrame{

     public square(){

          setSize(400,400);

          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          setLocationRelativeTo(null);

          setVisible(true);

     }



     public static void main(String a[]){

         new square();

     }



     public void paint(Graphics g){

          Color PURPLE=new Color(255,0,255);

          g.setColor(PURPLE);

          g.fillRect(100, 100, 100, 100);

          g.drawRect(100, 100, 100, 100); // FOR RECT

     }

}

