import java.util.HashSet;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashSet <String> books = new HashSet<String>();
      books.add("C");
      books.add("Java");
      books.add("C");
      System.out.println(books);
	
	
	TreeSet <String> books1 = new TreeSet<String>();
	books1.add("Java");
	books1.add("C");
	books1.add("Dotnet");
	books1.add("C");
	System.out.println(books1);
	
	}
	
	

}
