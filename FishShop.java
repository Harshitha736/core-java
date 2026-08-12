class FishShop{
     
	 public static void sell(String fishName,int quantity,double price)
	 {
		System.out.println("running sell in FishShop"); 
		System.out.println("fishName:"+fishName); 
		System.out.println("quantity:"+quantity);
	    System.out.println("price:"+price);
 
		if (fishName == null)
	{
		System.out.println("Invalid");
	}
    else{
		System.out.println("Valid");
	} 
	 }



}