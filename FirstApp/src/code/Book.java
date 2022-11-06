package code;

/**
 * This class is written to represent the details of the book
 * @author Dilrukshi
 * @version 1.0
 */

public class Book {

	/**
	 * This is to store the name of the book
	 */
	private String book_name;
	/**
	 * This is to store the id of the book
	 */
	private int book_id;
	/**
	 * This is t store the year of the book
	 */
	private int year;
	/**
	 * This is t store the author of the book
	 */
	private String author;
	
	/**
	 * This is the constructor to sell all the attributes of the Book class
	 * @param book_name
	 * @param book_id
	 * @param year
	 * @param author
	 */
	public Book(String book_name, int book_id, int year, String author) {
		
		this.book_name = book_name;
		this.book_id = book_id;
		this.year = year;
		this.author = author;
	}
	
	
	
	public Book() {
		super();
	}



	/**
	 * This methods return the name of a book
	 * @return
	 */
	public String getBook_name() {
		return book_name;
	}
	/**
	 * This method return the id of the book
	 * @return
	 */
	public int getBook_id() {
		return book_id;
	}
	/**
	 * This method return the year of the book
	 * @return
	 */
	public int getYear() {
		return year;
	}
	/**
	 * This method return the author of the book
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	
}
