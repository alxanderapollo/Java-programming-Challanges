/*
 *  *  Written By Alex Salazar
 *  3/1/18
 *  CSC 212
 *  Professor: Kenneth Lord
 *  Lab instructor:Cong Chen
 *  Lab section:11H
 *  
 *  purpose: A simple class to create a GridLayout with two textAreas, taking in two arrays as constructor Parameters
 *  
 */
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class BoxGUI{
	
	BoxGUI(String unSorted[], String sorted[]){
		
			String title = "UnSorted and Sorted Arrays"; //title
			JFrame frame = new JFrame(title); // titles the frame 
		
		Container content = frame.getContentPane(); //holds together the pane
		content.setLayout(new GridLayout(0,2, 3, 4)); //Creates Grid layout 
		
		//leftArea 
		JTextArea leftTextArea = new JTextArea();
		leftTextArea.append("Unsorted:");
		//print out unsorted  array
		for(int i = 0; i< unSorted.length; i++) {
		leftTextArea.append("\n"+unSorted[i]);
		}
		//Right Area
		JTextArea rightTextArea = new JTextArea() {

		      public boolean isManagingFocus() {
		          return false;
		        }
		      };
		  	rightTextArea.append("Sorted By volume array: ");
		  	for(int j = 0; j< sorted.length; j++){
		  	  	rightTextArea.append("\n"+sorted[j]);
		  	}
		
		content.add(leftTextArea);//left area
		
		content.add(rightTextArea);// right area 		

		
		frame.pack();
		frame.setVisible(true);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// closes frame on exit 
	}
}