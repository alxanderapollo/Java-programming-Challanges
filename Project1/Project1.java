/*
 *  Written By Alex Salazar
 *  3/1/18
 *  CSC 212
 *  Professor: Kenneth Lord
 *  Lab instructor:Cong Chen
 *  Lab section:11H
 *  
 *  Main File, File works with BoxGUI & Box classes.
 *  Purpose: to read in a file of integers and place those integers in an array; 
 *  then create Boxes objects and collect volume. Then Display contents
 *  using GUI Gridlayout where on the left side the original contents are displayed from the file(unsorted)
 *   and on the right side, a display of sorted created Volume from the objects
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
	public class Project1{
		//Selection sort method 
		public static int[] selectionSort(int[] array) {
			int n = array.length;
				 
		        // One by one move boundary of unsorted subarray
		        for (int i = 0; i < n-1; i++)
		        {
		            // Find the minimum element in unsorted array
		            int min_idx = i;
		            for (int j = i+1; j < n; j++)
		                if (array[j] < array[min_idx])
		                    min_idx = j;
		 
		            // Swap the found minimum element with the first
		            // element
		            int temp = array[min_idx];
		            array[min_idx] = array[i];
		            array[i] = temp;
		        }
			
			
			return array;	
		}
			public static void main (String[]args)throws java.lang.Exception{
				
				try{	
					//Prompt user for  name of the file, and create file object with name, append .txt to file.	
					String fileName;
					fileName = JOptionPane.showInputDialog("PLEASE ENTER THE NAME OF A FILE, NOTICE! ENTERING THE EXTENSION( .TXT) NOT NECESSARY");
					fileName+=".txt";
					//fileReader object
					FileReader file = new FileReader(fileName);
					//Scanner object will read file
					@SuppressWarnings("resource")
					
					//Buffer reader to read file 
					BufferedReader reader = new BufferedReader(file);
	
					String text = ""; // will hold each line of the file that is read
					String line = reader.readLine(); // will read each line in the textFile
					//read file
				 while (line!= null){ //while it is not the end the of the file Con't
					 text +=line; //adds file contents 
					 line = reader.readLine(); //Con't to the next element in the file
					 text+=",";//places a comma at the end of the line
		           }
				 
				 //this block of code will parse all the strings into Integers 
				 String [] strArray = new String[text.length()]; //array will hold contents 
				
				 strArray = text.split(",");// will remove commas
				 int intArry[]  =  new int [strArray.length]; //int array for conversion from String to int
				 
				 //size of the array is created with the number of elements read from the file
				 
				 //parse the strings into ints 
				 for(int i = 0; i< strArray.length; i++) {
					 intArry[i] = Integer.parseInt(strArray[i]);
				 }
				 
				 int volumeTemp []  = new int[(strArray.length/3)]; //will hold the volume of objects 
				 
				  //Note: the Size of the Volume temp is decided by the amount of elements found in the contents divided by 3
				  //3 because  to each line there are three dimensions making one box, and creating one volume. 
				  

				 //Create objects of the files contents
				 //l stands for length
				 //w for width
				 //h for height
				 // g is just another variable to help decide the postion to create the objects 
				 int l,w,h, g;
				 l =0;
				 w = 0;
				 h = 0;
				 g = 0;
				 
				 //in this block of code k starts at zero which will determine the position in which to place the number in the  intarray
				 // to insure each element is placed in the correct position i continued to increment k
				 //since the the size of the intarray will invariably be bigger than the size of the volumeTemp array
				 //g becomes necessary to place in the correct position 
				 for(int k = 0; k<intArry.length; k++) {
					 //every 3 items turned into an object 
					 l = intArry[k];
					 k++;
					 w = intArry[k];
					 k++;
					 h = intArry[k];	
			         //create object
					 Box obj =  new Box(l,w,h); 
					 System.out.print(obj);//explicit call to toString Method.
					 //collect volume & store into the array
					 volumeTemp[g]=obj.getVolume();
					 g++;
				 }//end of for loop 
				
				 //sort volume array
				 	selectionSort(volumeTemp);
		
				 	String unSorted[] = new String[strArray.length];// will be the same size as the intArry
				 	String Sorted[] = new String [volumeTemp.length];// will be the same size as the VolumeTemp array
				 	//parses ints into Strings
				 	for(int s =0; s<volumeTemp.length; s++) {
				 		Sorted[s] = String.valueOf(volumeTemp[s]);
				 		}
				 	
				 	//parse contents into String array 
				 	for (int q = 0; q<(strArray.length); q++) {
				 		unSorted[q] = String.valueOf(intArry[q]);
				 	}
				 	//create gui object to display both unsorted original contents and the sorted volume 	
				 	BoxGUI test = new BoxGUI(unSorted, Sorted);
				
	
					}//end Try block 
		
					catch (NumberFormatException e) {
						e.printStackTrace();
					}//end catch
		
			}//end main
	}// end class
	