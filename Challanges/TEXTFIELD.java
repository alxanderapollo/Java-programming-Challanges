import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TEXTFIELD extends JFrame 
{
   private JPanel panel;
   private JLabel label;
   private JLabel label2;
   private JTextField textField;
   private JTextField textField2;
   private JButton login;
   private String Username = "Alex";
   private String pass = "NASA";
   private int count = 0;
   public TEXTFIELD(String title) 
   {
      setTitle(title);
   	
      CreateTEXTFIELDComponents();
      CreateBUTTONComponents();
   	
   	
   	
   	
   	
      pack();
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   	
   	
   }
   public void CreateTEXTFIELDComponents()
   
   {
      label = new JLabel("Enter username here");
      textField = new JTextField(10);
      label2 = new JLabel("Enter password here");
      textField2 = new JTextField(10);		
   	
      panel = new JPanel();
   	
      panel.add(label);
      panel.add(textField);
   	
      panel.add(label2);
      panel.add(textField2);
   	
      add(panel);
   	
   	
   }
   public void CreateBUTTONComponents()
   {
      login = new JButton("LOG IN");
      TEXTListener listener = new TEXTListener();
      login.addActionListener(listener);
      panel.add(login);
   }
   private class TEXTListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String USERNAME = textField.getText();
         String PASS = textField2.getText();
         if(USERNAME.equals(Username)&&pass.equals(PASS))
            JOptionPane.showMessageDialog(null,"Loggin in...");
         
         else
         {
            count++;
            JOptionPane.showMessageDialog(null,"Please Try again");
            textField.setText("");
            textField2.setText("");
         	
         }
         if(count == 3){
            System.exit(0);
         }
      		
      }
   }
   public static void main(String []alex)
   {
      TEXTFIELD practice = new TEXTFIELD("TEXTFIELD PRACTICE");
   }
	

}
