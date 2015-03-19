public  class javaMainClass {

    public static void main(String[] args) 
    {
        System.out.println("Hello, World");
        System.out.println("My First Java Program in my system");
        
        System.out.println("Hi how are you?----");
        
        javaMainClass obj=new javaMainClass();
        int result=obj.addition(10,15);
        System.out.println("Result:"+result);
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

