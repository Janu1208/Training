import java.util.ArrayList;

public class UserDefine {

	public static void main(String[] args) {
		Book bk1= new Book();
		bk1.bookName = "Java";
		bk1.cost = 200;
		bk1.author = "Franklin";
		
		Book bk2 = new Book();
		bk2.bookName = "C";
		bk2.cost = 300;
		bk2.author="Balagu";
		
		ArrayList <Book> list = new ArrayList<Book>();
		list.add(bk1);
		list.add(bk2);
		
		for(Book book: list)
			System.out.println(book.bookName +"-" +book.cost +"-" +book.author );
	}
	

}
