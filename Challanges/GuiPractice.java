import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GuiPractice extends JFrame {
   private JPanel MainPanel; // Main Panel
   private JPanel ButtonPanel; //Panel to hold button components
   private JPanel TextFieldPanel; // to hold the text field components
   private JPanel TextAreaPanel; // to hold the text area Components 
   private JButton Append,Clear; // Append and clear buttons
   private JTextArea textArea;

   private JLabel label;// label for the textField
   private JTextField textField; //Small text field 10 visible characthers

   public GuiPractice(String title) 
   {
      setTitle(title);
      setVisible(true);
   	
      MainPanel = new JPanel();
      MainPanel.setLayout(new BorderLayout());
   	
   	
      CreateButtonComponents();
      CreateTextFieldComponenets();
      CreateTextAreaComponents();
   	
   		
   	
      pack();
      add(MainPanel);
   	
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   	
   }
   public void CreateButtonComponents()
   {
      Append = new JButton("Append");
      Clear = new JButton("Clear");
      Componentlistener listener = new Componentlistener();
      Append.addActionListener(listener);
      Clear.addActionListener(listener);
      ButtonPanel = new JPanel();
      ButtonPanel.add(Append);
      ButtonPanel.add(Clear);
      MainPanel.add(ButtonPanel,BorderLayout.SOUTH);
   	
   }
   public void CreateTextFieldComponenets()
   {
      label = new JLabel("Enter Text here");
      textField = new JTextField(10);
      TextFieldPanel = new JPanel();
      TextFieldPanel.add(label);
      TextFieldPanel.add(textField);
      MainPanel.add(TextFieldPanel,BorderLayout.NORTH);
   	
   	
   			
   }
   public void CreateTextAreaComponents()
   {
      textArea = new JTextArea(10,20);
   	
      TextAreaPanel = new JPanel();
   	
      JScrollPane scrollPane  = new JScrollPane(textArea);
      textArea.setLineWrap(true);
      TextAreaPanel.add(textArea);
      TextAreaPanel.add(scrollPane );
   	
   	
      MainPanel.add(TextAreaPanel,BorderLayout.CENTER);
   	
   	
   	
   }
   private class Componentlistener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==Append)
            textArea.append(textField.getText());
         else if(e.getSource()==Clear){
            textArea.setText("");
            textField.setText("");
         }
      		
      		
      }
   }
	
	
	
   public static void main(String []alex)
   {
      GuiPractice guione = new GuiPractice("Jtextfield");	
   }

}
