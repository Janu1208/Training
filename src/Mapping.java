import java.util.HashMap;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String,Integer> books = new HashMap<String, Integer>();
      books.put("C", 250);
      books.put("Java", 400);
      books.put("Python", 300);
      books.put("DotNet", 300);
      //System.out.println(books);
      
      for(String bookName: books.keySet()) {
          Integer price = books.get(bookName);
          System.out.println("Book Name:" + bookName + ",Price:" + price );
      }
	}

}
