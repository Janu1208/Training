
public class ExcHandling {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		div(10,0);
			}

	public static int div(int a, int b)
	{
		int c=0;
		try
		{
		     c=a/b;
			System.out.println(c);

		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return c;
		
	}
}
