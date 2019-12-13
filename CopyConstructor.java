//Copy Constructor Using Constructor
package java_basics;

class CopyConstructor1 {

	//First Step Create Constructor
	
	//Second Step instance Variable
	int id;
	String Name;
	
	//Create Constructor
	CopyConstructor1(int id,String Name)
	{
		this.id=id;
		this.Name=Name;
	}
	
	//Create CopyConstructor Or Second Constructor
	CopyConstructor1(CopyConstructor1 copy1)
	{
		id= copy1.id;
		Name=copy1.Name;
	}
	void display()
	{
		System.out.println("ID"+id+"//"+"Name"+Name);
	}
	
}
public class CopyConstructor
{
	public static void main(String[] args) {
		CopyConstructor1 copy = new CopyConstructor1(1,"Aman");
		CopyConstructor1 copy1 = new CopyConstructor1(copy);
		copy.display();
		copy1.display();
	}
}
