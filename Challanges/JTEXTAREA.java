import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
public class JTEXTAREA extends JFrame 
{
	private JTextArea textArea;
	private JPanel panel;
	private JButton lock,clear;
	
	private JPanel buttonPanel; // a panel must be created hold the buttons, this is we can add both button the main panel and placed together at a specific point 
	private JPanel TextAreapanel; // this is the panel to hold the TEXTAREA
	private boolean isLocked = false;
	public JTEXTAREA(String title) 
	{
		setTitle(title);
		
		CreateTextAreaComponents();
		CreateButtonComponents();
		pack(); //pack fixes the size of the window according the components added to the window 
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public void CreateTextAreaComponents()

	{
		/*
		panel = new JPanel();
		
		textArea = new JTextArea(5,10); //Creates a Text Area 10 by 20
		//panel.add(textArea, BorderLayout.CENTER);
		textArea.setLineWrap(true); // wraps a new line of text once the box is filled
		
		JScrollPane scrollPane  = new JScrollPane(textArea);
		panel.add(scrollPane ); // adds a Scrolling bar
		
		*/
		
		
		
		
	}
	public void CreateButtonComponents()
	{
		panel = new JPanel();
		
		textArea = new JTextArea(5,10); //Creates a Text Area 10 by 20
		//panel.add(textArea, BorderLayout.CENTER);
		textArea.setLineWrap(true); // wraps a new line of text once the box is filled
		
		JScrollPane scrollPane  = new JScrollPane(textArea);
		
		TextAreapanel = new JPanel();
		TextAreapanel.add(textArea);
		TextAreapanel.add(scrollPane );
		
		
		
		//panel.add(scrollPane ); // adds a Scrolling bar
		
		lock = new JButton("Lock");
		clear = new JButton ("Clear");
		JTextAreaListener listener = new JTextAreaListener();
		lock.addActionListener(listener);
		clear.addActionListener(listener);
		
		
		
			//panel.add(lock);
			//panel.add(clear);
		//JTextAreaListener listener = new JTextAreaListener();
		
			
			panel.setLayout(new BorderLayout());
			
			buttonPanel = new JPanel();
			
			buttonPanel.add(lock);
			buttonPanel.add(clear);
			
			panel.add(TextAreapanel, BorderLayout.CENTER);
			panel.add(buttonPanel, BorderLayout.SOUTH);
			
			add(panel);
			
			
	}
	private class JTextAreaListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == lock)
			{
				isLocked = !isLocked;
				if(isLocked)
				{
					lock.setText("Unlocked");
					textArea.setEditable(false);
				}
				else
				{
					lock.setText("LOCK");
					textArea.setEditable(true);
				}
			}
				else
					textArea.setText("");	
					
			
					
				}
					
				
				
			
		}
	
	public static void main(String []alex)
	{
		JTEXTAREA apples = new JTEXTAREA("Practice");
	}

}
