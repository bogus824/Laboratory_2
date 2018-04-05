import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * It is a class whose aim is to carry out required exercise
 * @author Kamil Bogdanowski
 *
 */

public class Testing{
	
		/**
		 * Method whose aim is to display simple menu 
		 */
		public void Menu()
		{
			System.out.println("_____________________________________________________\n" +
							  "| 						     |\n" +
							  "|			 Menu			     |\n" +
							  "|						     |\n" +
							  "|		 Choose the option 		     |\n" +
							  "|         	 1. Cylinder			     |\n" +	
							  "|		 2. Rod 			     |\n" +
							  "|		 3. Sphere		             |\n" +	
							  "|		 4. Exit			     |\n" +
							  "|						     |\n" +
							  "|____________________________________________________|\n");
			
		}
		
		/**
		 * Method whose aim is to read values from the console 
		 * @param number - temporary value used for 
		 * @return
		 */
		public static float BreaderValue (float number)
		{
			float n = 0f;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				try {
					n= Float.parseFloat(br.readLine());
				if(n >= 0)
					{
					break;
					}
				System.out.println("Wrong data - check values whether positive or in accordance with the applied menu");
					}
				catch(NumberFormatException excp)
				{
					System.out.println("It is not a int or float or any number type");
				}	catch(IOException excp)
				{
					excp.printStackTrace();
				}
		
				
			}
			number = n;
			return number;
		}
	
		/**
		 * Method whose aim is to set choice number in further switchcase section
		 * @param choice - number of choice  
		 * @param max_range - we can set this variable to maximum number of choices in the menu to prevent choosing a number out of choices
		 * @return
		 */
		public static int BreaderChoice (int choice, int max_range)
		{
			int chosennumber = 0;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				try {
					System.out.println("What number would you like to choose?");
					chosennumber= Integer.parseInt(br.readLine());
				if(chosennumber > 0 && max_range > chosennumber)
					{
					break;
					}
				System.out.println("Wrong data - check values whether positive or in accordance with the applied menu");
					}
				catch(NumberFormatException excp)
				{
					System.out.println("It is not a int or float or any number type");
				}	catch(IOException excp)
				{
					excp.printStackTrace();
				}
		
				
			}
			choice  = chosennumber;
			return choice;
			
		}
		
		/**
		 * Method whose aim is to return to menu after choosing appropriate number in menu
		 * @throws IOException
		 */
		public static void backToMenu() throws IOException {
	        System.out.println("Press default button to return to Menu");
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        bufferedReader.readLine();
	    }
		
		public static void main(String[] args) throws IOException, InterruptedException{
		
		System.out.println("Exercise 1\n");
		
		//Declaration of the objects (radius,heigth, mass, x,y,z)
		Cylinder Cylinder1 = new Cylinder(12f,6f,5f,3f,1f,2f);
		Cylinder1.SteinerDistances(12f,5f,4f);
		
		Sphere Sphere1 = new Sphere(5f,6f,1f,2f,3f);
		Sphere1.SteinerDistances(4f, 1f, 3f);
		
		Rod Rod1 = new Rod(12f,5f,3f,1f,12f);
		Rod1.SteinerDistances(12f,5f,4f);
		System.out.println("Done \n");
		
		
		
		System.out.println("Exercise 2\n");
		
		//Showing info about objects
		Cylinder1.Show_SpecificInfo();
		Sphere1.Show_SpecificInfo();
		Rod1.Show_SpecificInfo();
		
		System.out.println("Done\n");
		
		
	
        System.out.println("Exercise 3 and 4 and 5\n");
		
        //Creating an array to gather all of the objects
		Material_Point[] Array = new Material_Point[3];
		
        Array[0] = new Cylinder(12f,6f,5f,3f,1f,2f);
        Array[0].SteinerDistances(12f, 4f, 2f);
        
        Array[1] = new Rod (12f,5f,3f,1f,12f);
        Array[1].SteinerDistances(3f, 2f, 1f);
        
        Array[2] =  new Sphere(5f,6f,1f,2f,3f);
        Array[2].SteinerDistances(12f, 3f, 5f);
        
        int counter = 0;
        
        for(Material_Point z: Array)
        {
        	//Checking type and class with using class Object's method
        	if(z.getClass().getTypeName()=="Cylinder")
        	{
        		System.out.println("Object nr: " + counter);
        		
        		//Using overriding 
        		((Cylinder)z).Show_SpecificInfo();
        		counter++;
        	}
        	else if(z.getClass().getTypeName()=="Rod")
        	{
        		System.out.println("Object nr: " + counter);
        		((Rod)z).Show_SpecificInfo();
        		counter++;
        	}
        	else if(z.getClass().getTypeName()=="Sphere")
        	{
        		System.out.println("Object nr: " + counter);
        		((Sphere)z).Show_SpecificInfo();
        		counter++;
        	}
        }
        System.out.println("Done\n");
        System.out.println("Exercise for 5 grade");
	
   
       int choicee = 0;
       
       //Creating temporary objects with no specific parameters
       Cylinder tempCylind = new Cylinder();
       Rod tempRod = new Rod();
       Sphere tempSphere = new Sphere();
        
        while(true)
        {
        	Testing Test = new Testing();
        	Test.Menu();
        	
        	
        	switch (BreaderChoice(choicee,5)) {
        	case 1:
        	{
        		float tempmass = 0;
                float tempheigth = 0;
                float tempradius = 0;
                float tempx = 0;
                float tempy = 0;
                float tempz = 0;
                float tempdx = 0;
                float tempdy = 0;
                float tempdz = 0;
                
                System.out.println("\n" + "You chose a Cylinder \n");
                
                System.out.println("Put Mass of the Cylinder");
                tempmass = BreaderValue(tempmass);
                tempCylind.ChangeMass(tempmass);
                
                System.out.println("Put Radius of the Cylinder");
                tempradius = BreaderValue(tempradius);
                
                System.out.println("Put Heigth of the Cylinder");
                tempheigth = BreaderValue(tempheigth);
                                
                System.out.println("Put centre x of the Cylinder");
                tempx = BreaderValue(tempx);
                
                System.out.println("Put centre y the Cylinder");
                tempy = BreaderValue(tempy);
                
                System.out.println("Put centre z the Cylinder");
                tempz = BreaderValue(tempz);
                
                tempCylind.ChangeVariable(tempradius,tempheigth,tempx,tempy,tempz);
                
                System.out.println("Put x coordinate of Steiner Axis");
                tempdx = BreaderValue(tempdx);
                
                System.out.println("Put y coordinate of Steiner Axis");
                tempdy = BreaderValue(tempdy);
                
                System.out.println("Put z coordinate of Steiner Axis");
                tempdz = BreaderValue(tempdz);
                
                tempCylind.SteinerDistances(tempdx, tempdy, tempdz);
                
                tempCylind.Show_SpecificInfo();
                backToMenu();

                break;
                
        	}
        	case 2:
        	{
        		float tempmass = 0;
        		float templength = 0;
                float tempx = 0;
                float tempy = 0;
                float tempz = 0;
                float tempdx = 0;
                float tempdy = 0;
                float tempdz = 0;
                
                System.out.println("\n" + "You chose a Rod \n");
                
                System.out.println("Put Mass of the Rod");
                tempmass = BreaderValue(tempmass);
                tempRod.ChangeMass(tempmass);    
                
                System.out.println("Put length of the Rod");
                templength = BreaderValue(templength);
                 
                System.out.println("Put centre x of the Rod");
                tempx = BreaderValue(tempx);
                
                System.out.println("Put centre y the Rod");
                tempy = BreaderValue(tempy);
                
                System.out.println("Put centre z the Rod");
                tempz = BreaderValue(tempz);
                
                tempRod.ChangeVariable(templength,tempx,tempy,tempz);
                
                System.out.println("Put x coordinate of Steiner Axis");
                tempdx = BreaderValue(tempdx);
                
                System.out.println("Put y coordinate of Steiner Axis");
                tempdy = BreaderValue(tempdy);
                
                System.out.println("Put z coordinate of Steiner Axis");
                tempdz = BreaderValue(tempdz);
                
                tempRod.SteinerDistances(tempdx, tempdy, tempdz);
                
                tempRod.Show_SpecificInfo();
                backToMenu();

                break;
        	}
        	case 3:
        	{
        		float tempmass = 0;
        		float tempradius = 0;
                float tempx = 0;
                float tempy = 0;
                float tempz = 0;
                float tempdx = 0;
                float tempdy = 0;
                float tempdz = 0;
                
                System.out.println("\n" + "You chose a Sphere \n");
                
                System.out.println("Put Mass of the Sphere");
                tempmass = BreaderValue(tempmass);
                tempSphere.ChangeMass(tempmass);    
                
                System.out.println("Put Radius of the Sphere");
                tempradius = BreaderValue(tempradius);
                
                System.out.println("Put centre x of the Sphere");
                tempx = BreaderValue(tempx);
                
                System.out.println("Put centre y the Sphere");
                tempy = BreaderValue(tempy);
                
                System.out.println("Put centre z the Sphere");
                tempz = BreaderValue(tempz);
                
                tempSphere.ChangeVariable(tempradius,tempx,tempy,tempz);
                
                System.out.println("Put x coordinate of Steiner Axis");
                tempdx = BreaderValue(tempdx);
                
                System.out.println("Put y coordinate of Steiner Axis");
                tempdy = BreaderValue(tempdy);
                
                System.out.println("Put z coordinate of Steiner Axis");
                tempdz = BreaderValue(tempdz);
                
                tempSphere.SteinerDistances(tempdx, tempdy, tempdz);
                
                tempSphere.Show_SpecificInfo();
                backToMenu();

                break;
        	}
        	case 4:
        	{
        		 
                System.out.print("Quittinq");
                Thread.sleep(500);
                System.out.print(" . ");
                Thread.sleep(500);
                System.out.print(" . ");
                Thread.sleep(500);
                System.out.println(" . ");
                
                System.exit(0);
                break;
        	}
        
        	
        }         
	}
}
}
