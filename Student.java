class Student{

   public static void sell(String name,int age,String usn,String course,int semester,String college,
   double percentage,char section,boolean passed,String address){
   
   System.out.println("running book in Theater");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("USN: " + usn);
    System.out.println("Course: " + course);
    System.out.println("Semester: " + semester);
    System.out.println("College: " + college);
    System.out.println("Percentage: " + percentage);
    System.out.println("Section: " + section);
    System.out.println("Passed: " + passed);
    System.out.println("Address: " + address);
   
   if ( name== null)
	{
		System.out.println("Invalid");
	}
    else{
		System.out.println("Valid");
	} 
   }


}
