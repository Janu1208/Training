import java.util.ArrayList;

public class CollFrame {

	public static void main(String[] args) {

		ArrayList bookList=new ArrayList();
		bookList.add("Java");
		bookList.add("C");
		bookList.add("Dot Net");
		bookList.add("DB");
		//bookList.add(123);
		//bookList.add("j78");
       /* for(Object obj: bookList) {
             String bookName = (String) obj;
             System.out.println(bookName);
        } */       
         for(Object bookName : bookList)   
         {
        	 System.out.println(bookName);
         }
       }
	}
         

