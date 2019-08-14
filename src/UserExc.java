
public class UserExc {

	public static void main(String[] args) {
	   String name="Bavishya";
	   String dept=null;
	   try {
		ValidateStudentDetails( name,dept);
		addStudentToDatabase(name,dept);
	} 
	   catch (Exception e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}
	   finally
	   {
		System.out.println("reached finally block");   
	   }

	}
	public static void ValidateStudentDetails(String name,String dept ) throws Exception
	{
		System.out.println("Validation");
		if(name==null)
			throw new Exception("Invalid Name");
		if(dept==null)
			throw new Exception("Invalid dept");
	}
	public static void addStudentToDatabase(String name, String dept)
	{
		System.out.println("Details of the student is adding to database");
		System.out.println("Name:"+ name);
		System.out.println("Department:"+dept);
	}

}
