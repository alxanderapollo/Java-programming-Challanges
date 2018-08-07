

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ball extends JFrame
{
   private int BoxHeight = 100;
   private int BoxWidth = 100;
   private JButton button;
   public Ball()
   {
       
      setSize (500, 500); 
      Ball1Panel ball1Panel=new Ball1Panel();
      add(ball1Panel);
        
       // button= new JButton("Move");
        //button.addActionListener(new Listener());
        //ball1Panel.add(button);
        
        
        
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      Timer timer = new Timer(20, new Listener() );
      timer.start();
        
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
               
         repaint();
         
      }
     
   }
        
   public static void main(String[] args)
   {
      new Ball();
         
   }
}
    

class Ball1Panel extends JPanel{
    
   private int x=0;
   private int y=0;
   private int dx = 10;
   private int dy = 10;
        
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
        
      int width = (int)getWidth();
      int height = (int)getHeight();
        
      if(x>=width)
         dx = -Math.abs(dx);
      if(x<0)
         dx = Math.abs(dx);
      if(y>=height)
         dy = -Math.abs(dy);
      if(y<0)
         dy = Math.abs(dy);
        
      x+=dx;
      y+=dy;
        
      g.setColor(Color.BLUE);
        //g.drawLine(20, 20, 100, 100);
      g.fillOval(x, y, 20, 20);
      g.drawString("("+x+","+y+")", 10, 40);
        
        /*g.setColor(Color.YELLOW);
        g.fillRect( 100, 200, 150, 50);
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.BOLD , 36));
        g.drawString("CSC210", 10, 40);*/
        
        
        /*x+=1;
        y+=1;
        */
        
        
   
       
                
   }

}
