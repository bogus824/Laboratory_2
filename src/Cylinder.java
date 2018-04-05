/**
 * 
 * This inherited class's aim is to create a Cylinder with default or specific parameters
 * and to calculate and show required features of this object
 * 
 * @author Kamil Bogdanowski
 *
 */

public class Cylinder extends Material_Point 
	{
		
		protected float radius_basis;
		protected float heigth;
		
		/**
		 * Constructor with parameteres
		 * @param r - radius
		 * @param h - heigth
		 * @param PointMass - mass
		 * @param x - central x coordinate
		 * @param y - central y coordinate
		 * @param z - central z coordinate
		 */
		public Cylinder(float r,float h,float PointMass,float x,float y, float z) 
		{
			super(PointMass,x,y,z);
			if(r>0 && getMass()>0 && h>0)
			{
				radius_basis = r;
				heigth = h;
				
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
		public Cylinder()
		{
			radius_basis = 1f;
			mass = 1f;
			x_coordinate = 0;
			y_coordinate = 0;
			z_coordinate = 0;
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
		 * Getter type method whose aim is to return Heigth
		 * @return
		 */
		public float getHeigth()
		{
			return heigth;
		}
		
		/**
		 * Method whose aim is to calculate Inertia of the Cylinder
		 */
		public float Inertia()
		{
			I = 0.5f * mass * radius_basis * radius_basis;
			return I;
		}
		
		/**
		 * Overriden method which display the name of the geometrical object
		 */
		public String ShowName()
		{
			name = "Cylinder";
			return name;
		}
		
		/**
		 * Method whose aim is to change variables with the new ones declared in the brackets
		 * @param tempvar - temporary variable - specific for each type of the figure for example radius
		 * @param temphgth - new heigth
		 * @param tempx - new x coordinate of the centre
		 * @param tempy - new y coordinate of the centre
		 * @param tempz - new z coordinate of the centre
		 */
		public void ChangeVariable(float tempvar,float temphgth, float tempx, float tempy, float tempz)
		{
			if(tempvar>0 && tempx >0 && tempy > 0 && tempz >0 && temphgth >0)
			{
			radius_basis = tempvar;
			x_coordinate = tempx;
			y_coordinate = tempy;
			z_coordinate = tempz;
			heigth = temphgth;
			}else {System.out.println("Wrong data");}
		}
		
		/**
		 * Method whose aim is to show speciifc info concerning each type of object
		 */
		public void Show_SpecificInfo()
		{
			System.out.println("Radius of the basis is " + getRadius() + " and its heigth " + getHeigth()) ;
			Show_Info();
		}
	}