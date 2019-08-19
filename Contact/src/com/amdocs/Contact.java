package com.amdocs;
import java.util.*;
public class Contact {
	private HashMap<String ,String> contact;
	
	public Contact()
	{
		this.contact=new HashMap<String , String >(); 
	}
	public void addcontact(String mobno,String name)
	{
		contact.put(mobno,name);
	}
	public String findcontactnamebymobno(String mobno)
	{
		String name=contact.get(mobno);
		if(name==null)
			return mobno;
		else return name;
	}

	public static void main(String[] args) {
		Contact contact=new Contact();
		contact.addcontact("8787654312","Rishi");
		contact.addcontact( "6543218765","Arun");
		
		String name=contact.findcontactnamebymobno("8787654312");
		String name2=contact.findcontactnamebymobno("7653");
		System.out.println(name+" "+name2);
	}

}
