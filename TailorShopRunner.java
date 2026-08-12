class TailorShopRunner{

       public static void main (String... values){
	    
		String dressType="Shirtt";
		double width=40.5;
		String material="Cotton";
		String pattern="Plain";
		int price=800;
		boolean iron=true;
		String date="03-07-2012";
		double time=10.30;
		
		
		TailorShop.stitch(dressType,width,material,pattern,price,iron,date,time);
	   }
}