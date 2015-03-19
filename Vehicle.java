/*----------------------------------------------------
 Base class
 -----------------------------------------------------*/

public class Vehicle
{
   //Default constructor
    Vehicle()
    {
     System.out.println("inside vehicle constructor method");
    }
   //public method
    public void vehicleMethod()
   {
    System.out.println("inside vehicle class");
   }

 //destructor
  ~Vehicle()
  {
    System.out.println("inside vehicle destructor method");
  }
}