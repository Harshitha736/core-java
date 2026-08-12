class Theater{

public static void book(String movieName,int quantity,String screen,boolean discount,boolean orderSnacks){
	
			System.out.println("running book in Theater"); 
		    System.out.println("movieName:"+movieName); 
            System.out.println("quantity:"+quantity); 
            System.out.println("screen:"+screen); 
            System.out.println("discount:"+discount); 
            System.out.println("orderSnacks:"+orderSnacks); 
			
           if (movieName == null)
	{
		System.out.println("Invalid");
	}
    else{
		System.out.println("Valid");
	} 
	
	
	
}





}