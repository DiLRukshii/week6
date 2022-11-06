/**
 * 
 */
package code;

/**
 * @author Dilrukshi
 *@see Book
 */
public class App {
 /**
 * This is an object of the Book Class
 * @see Book
 
 */

static Book book;
	/**
	 * Create a book object and display of the book details to the console
	 * @param args
	 */
	public static void main(String[] args) {
		Book book=new Book("Secret" , 1, 1999, "Rhonda Byrne");
		String details=book.getBook_name()+" "+book.getBook_id()+" "+book.getYear()+" "+book.getAuthor();
		System.out.print(details);
				
	}

}
