package static_nonstatic;

public class Contacts_MainClass 
{
	public static void main(String[] args) 
	{
		Contact f1 = new Contact();
		Contact f2 = new Contact();
		Contact f3 = new Contact();
		Contact f4 = new Contact();
		f1.name = "Anu";
		f1.contactNumber = "456710";
		f1.bloodGroup = "O+ve";
		f2.name = "Abhi";
		f2.contactNumber = "9764321";
		f2.bloodGroup = "A-ve";
		System.out.println(f1.name);
		System.out.println(f1.contactNumber);
		System.out.println(f1.bloodGroup);
		System.out.println(f1.nationality);
		System.out.println(f2.name);
		System.out.println(f2.contactNumber);
		System.out.println(f2.bloodGroup);
		System.out.println(f2.nationality);
		
		System.out.println("=========================================");
		System.out.println(f3.name);
		System.out.println(f3.contactNumber);
		System.out.println(f3.bloodGroup);
		System.out.println(f3.nationality);
	}
}



class Contact
{
	public String name;
	public String contactNumber;
	public static String nationality = "Indian";
	public String bloodGroup;
	
	
}