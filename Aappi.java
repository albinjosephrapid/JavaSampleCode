import java.util.ArrayList;


class Test implements Runnable
{
    Thread thread;
    String threadName;
    ArrayList list;
    
    Test(String thName)
    {
    	this.threadName = thName;
    }
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread Started : "+this.threadName);
		
		for(int i = 0; i < 5000; i++)
		{
			System.out.print(this.threadName);
		}
	}
	
	public void start()
	{
		thread = new Thread(this,this.threadName);
		thread.start();
	}
}

public class Aappi 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("Kalli");
		
		Test test1 = new Test("One");
		test1.start();
		
		Test test2 = new Test("Two");
		test2.start();
	}
}
