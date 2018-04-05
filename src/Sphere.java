/**
 * This inherited class's aim is to create a Cylinder with default or specific parameters
 * and to calculate and show required features of this object
 * 
 * @author Kamil Bogdanowski
 *
 */

public class Sphere extends Material_Point 
{	
	private float radius_basis;
	
	/**
	 * Constructor with parameteres
	 * @param r - radius
	 * @param PointMass - mass
	 * @param x - central x coordinate
	 * @param y - central y coordinate
	 * @param z - central z coordinate
	 */
	public Sphere(float r,float PointMass,float x,float y, float z) 
	{
			super(PointMass,x,y,z);
			if(r>0 && getMass()>0)
			{
				radius_basis = r;
				
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
	public Sphere()
		{
			radius_basis = 1f;
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
		if(tempvar>0 && tempx >0 && tempy > 0 && tempz >0)
		{
		radius_basis = tempvar;
		x_coordinate = tempx;
		y_coordinate = tempy;
		z_coordinate = tempz;
		}else {System.out.println("Wrong data");}
	}
	
	/**
	 * Getter type method whose aim is to return Radius
	 * @return
	 */
	public float getRadius()
		{
			return radius_basis;
		}
	
	/**
	 * Method whose aim is to calculate Inertia of the Sphere
	 */
	public float Inertia()
		{
			I = 0.4f * mass * radius_basis * radius_basis;
			return I;
		}
	
	/**
	 * Overriden method which display the name of the geometrical object
	 */
	public String ShowName()
		{
			name = "Sphere";
			return name;
		}
	
	/**
	 * Method whose aim is to show speciifc info concerning each type of object
	 */
	public void Show_SpecificInfo()
		{
			System.out.println("Radius of the sphere is " + getRadius()) ;
			Show_Info();
		}
}