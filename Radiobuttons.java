import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Radiobuttons extends JFrame 
{
   private JRadioButton RedButton;
   private JRadioButton BlueButton;
   private JRadioButton GreenButton;
   private JRadioButton YellowButton;
   private ButtonGroup group;
   private JPanel panel;
   public Radiobuttons() 
   {
      setTitle("Color Changer");
      setLocationRelativeTo(null);
   	
      setVisible(true);
   	
      CreateRadioComponents();
   	
      add(panel);
      pack();
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   
   }
   public void CreateRadioComponents()
   {
      panel = new JPanel(); //create panel
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 10), "Colors"));
   
      group = new ButtonGroup();
      RedButton = new JRadioButton("Red Button"); //create the RadioButton components
      BlueButton = new JRadioButton("Blue Button");
      GreenButton = new JRadioButton("Green Button");
      YellowButton = new JRadioButton("Yellow Button");
   	
      Listener listener = new Listener(); //create Listener 
   	/*
   	 Then add listener to each radio button 
   	 */
   	
   	
      RedButton.addItemListener(listener); 
      BlueButton.addItemListener(listener); 
      GreenButton.addItemListener(listener); 
      YellowButton.addItemListener(listener); 
   	
      group.add(RedButton); // group them so each can be exclusive within one another 
      group.add(BlueButton);
      group.add(GreenButton);
      group.add(YellowButton);
   	
      panel.add(RedButton);
      panel.add(BlueButton);
      panel.add(GreenButton);
      panel.add(YellowButton);
   	
   	
   	
   	
   	
   	
   	
   	
   }
   private class Listener implements ItemListener
   {
      public void itemStateChanged(ItemEvent e)
      {
         if(RedButton.isSelected()){
            setColor(Color.RED);
         }
         else if (BlueButton.isSelected()){
            setColor(Color.BLUE);
         }
         if(GreenButton.isSelected()){
            setColor(Color.GREEN);
         }
         else if (YellowButton.isSelected()){
            setColor(Color.YELLOW);
         }
      		
      	
      }
   }
   public void setColor(Color c)
   {
      panel.setBackground(c);
      RedButton.setBackground(c);
      BlueButton.setBackground(c);
      GreenButton.setBackground(c);
      YellowButton.setBackground(c);
   	
   }
	
   public static void main(String []alex)
   {
      new Radiobuttons();
   	
   }

}
