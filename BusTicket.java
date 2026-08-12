class BusTicket{
	
	public static void book(String from, String to, int age, String address, int pincode, String paymentType, String bookingLocation){
		
					System.out.println("running book in Theater"); 
                    System.out.println("from:"+from);
					System.out.println("to:"+to);
                    System.out.println("age:"+age);
                    System.out.println("address:"+address);
                    System.out.println("pincode:"+pincode);
                    System.out.println("paymentType:"+paymentType);
                    System.out.println("bookingLocation:"+bookingLocation);
					
					if ( from== null)
	{
		System.out.println("Invalid");
	}
    else{
		System.out.println("Valid");
	} 

	}
	
	
	
	
}