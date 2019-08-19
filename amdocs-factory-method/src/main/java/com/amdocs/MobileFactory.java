package com.amdocs;

public class MobileFactory {

	public static IMobile getmobile(String mobilename)
	{
		IMobile mobile=null;
		
		if(mobilename.equals("IPhone4"))
			mobile=new IPhone4();
		
		else if(mobilename.equals("IPhone5"))
			mobile=new IPhone5();
		
		if(mobilename.equals("OnePlus5"))
			mobile=new OnePlus5();
		
		else
			mobile=new NullMobile();
		
		return mobile;
	}
	
}
