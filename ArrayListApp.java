
import java.util.*;

class ListApp
{
	ArrayList<String> listItems;
	
	public ListApp() {
		// TODO Auto-generated constructor stub
		
		this.listItems = new ArrayList<String>(); 
	}
	
	public void addListNames(String listName)
	{
		this.listItems.add(listName);
	}
	
	public void display()
	{
		for(int i = 0; i < this.listItems.size(); i++)
		{
			String str = this.listItems.get(i);
			
			System.out.print(" Name is : "+str+" ");
		}
	}
}

public class ArrayListApp
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListApp app = new ListApp();
		
		app.addListNames("Harish Kumar Kailas");
		
		app.addListNames("Albin Joseph");
		
		app.display();
	}

}
