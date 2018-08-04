/*

 * Written By Alexander Apollo Salazar
 * 02/27/18
 * Professor Kenneth Lord 
 * CSC 212
 * 
 * purpose : Box class, the class takes three parameters: length, width and height.  parameters Cannot be less be less than one.
 * 
 */
import javax.swing.JOptionPane;

public class Box {
	
	//Three Variable instances 
	private int length;
	private int width;
	private int height; 
	
	//default no argument  Constructor 
	public Box() { 
		length = 1;
		width = 1;
		height = 1; 
		
	}
	//User Defined input 
	public Box(int l , int w, int h) {
		
		//validation 
		if(l < 1 && w < 1 && h < 1){
			JOptionPane.showMessageDialog(null, "Numbers cannot be less than one, terminatiing program....");
			System.exit(0);
		}
		else{
			this.length = l;
			this.width = w;
			this.height = h;
		}
	}
	
	//getters methods 
	public int getLength() {
			return length;
	}
	public int getWidth() {
			return width;
	}
	public int getHeight() {
			return height;
	}
	
	//Setter Methods 
	public void setLength(int l) {
			this.length = l;
	}
	public void setWidth(int w) {
			this.width = w;
	}
	public void setHeight(int h) {
			this.height = h;
	}
	
	//Volume method 
	public int getVolume() {
			return (height*length*width);
	}
	
	// equals method 
	
	public boolean equals(Box other) {
		if(other == null)
			return false;
		else {
			int x,y,z; //first object parameters 
			int x2, y2, z2;//second object parameters 
			
			//first object
			x = this.getLength();
			y = this.getWidth();
			z = this.getHeight();
			// second object 
			x2 = other.getLength();
			y2 = other.getWidth();
			z2 = other.getHeight();
			
			if (x == x2 && y == y2 && z == z2) {
				return true;
			}// end if
			
				else {
					return false; 	
				}//end else 
		}//end outer else
	}// end method
	
	
	//overriding toString 
	public String toString() {
		return "\nL:"+this.length+" W:"+this.width+" H:"+this.height+ "(V:"+this.getVolume()+")";
	}	

}
