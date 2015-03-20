/*-------------------------------------------------------------
 Java Class with main method
 -------------------------------------------------------------*/

public  class javaMainClass {

    public static void main(String[] args) 
    {
        System.out.println("Hello, World");
        System.out.println("My First Java Program in my system");
        
        System.out.println("Hi how are you?----");
        
        javaMainClass obj=new javaMainClass();
        int result=obj.addition(10,15);
        System.out.println("Result:"+result);
        
        
        //Vehicle class object
        System.out.println("-----------Vehicle object----------");
        Vehicle vehicle=new Vehicle();
        vehicle.vehicleMethod();
        
        
        //FourWheller class object
        System.out.println("------------FourWheeler object-----------");
        FourWheeler fourWheeler=new FourWheeler();
        fourWheeler.vehicleMethod();
        
        
        //Benz class object
        System.out.println("------------Benz object-----------");
        Benz benz=new Benz();
        benz.vehicleMethod();
        
        
        //Employee class object
        /* Create two objects using constructor */
        System.out.println("------------Employee object-----------");
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");
        
        // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();
        
        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
        
    }
    
    
    /*-------------------------------------------------------------
     sample method for argument passing and value returm
     -------------------------------------------------------------*/
    public int addition(int one,int two)
    {
        int result=one+two;
        return result;
    }
}

