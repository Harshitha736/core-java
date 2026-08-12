class PanCard{
	
public static void apply(String firstName,String lastName,String middleName,char gender,String dob,long mobileNumber,String address,String emil)
{
	System.out.println("running apply in PanCard");
	System.out.println("firstName:"+firstName);
	System.out.println("lastName:"+lastName);
	System.out.println("middleName:"+middleName);
	System.out.println("gender:"+gender);
	System.out.println("mobileNumber:"+mobileNumber);
	System.out.println("address:"+address);
	System.out.println("emil:"+emil);
	
	if (firstName == null)
	{
		System.out.println("Invalid");
	}
    else{
		System.out.println("Valid");
	}
	
	}	

	
	
}