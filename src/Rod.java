/**
 * 
 * This inherited class's aim is to create a Rod with default or specific parameters
 * and to calculate and show required features of this object
 * @author Kamil Bogdanowski
 *
 */

public class Rod extends Material_Point 
{
		
	private float length;
	
	/**
	 * Constructor with parameteres
	 * @param l - length
	 * @param PointMass - mass
	 * @param x - central x coordinate
	 * @param y - central y coordinate
	 * @param z - central z coordinate
	 */
	public Rod(float l,float PointMass,float x,float y, float z) 
		{
			super(PointMass,x,y,z);
			if(l>0 && getMass()>0)
			{
				length = l;
				
			}
			else
			{
				System.out.println("Wrong datas applied");
				System.out.println("Check radius or heigth value");
			}
		}
	
	/**
	 * Constructor with default set values
	 */	
	public Rod()
		{
			length = 1f;
			mass = 1f;
			x_coordinate = 0;
			y_coordinate = 0;
			z_coordinate = 0;
		}
	
	/**
	 * Method whose aim is to change variables with the new ones declared in the brackets
	 * @param tempvar - temporary variable - specific for each type of the figure for example radius
	 * @param tempx - new x coordinate of the centre
	 * @param tempy - new y coordinate of the centre
	 * @param tempz - new z coordinate of the centre
	 */
	public void ChangeVariable(float tempvar, float tempx, float tempy, float tempz)
	{
		if(tempvar>0 && tempx >0 && tempy > 0 && tempz >0 )
		{
		length = tempvar;
		x_coordinate = tempx;
		y_coordinate = tempy;
		z_coordinate = tempz;
		}else {System.out.println("Wrong data");}
		
		
	}
	
	/**
	 * Method whose aim is to calculate Inertia of the Rod
	 */
	public float Inertia()
		{
			I = 1/12f * mass * length * length;
			return I;
		}

	/**
	 * Getter type method whose aim is to return Length
	 * @return
	 */
	public float getLength()
	{
		return length;
	}
	
	/**
	 * Overriden method which display the name of the geometrical object
	 */
	public String ShowName()
		{
			name = "Rod";
			return name;
		}
	
	/**
	 * Method whose aim is to show speciifc info concerning each type of object
	 */
	public void Show_SpecificInfo()
	{
		System.out.println("Length of the rod is " + getLength()) ;
		Show_Info();
	}
}