package stringQuestion;

	import java.util.ArrayList;

	 public  class Book {
	    private int bookId;
	    private String bookName;
	    private String authorName;

	    // Parameterized constructor
	    public Book(int bookId, String bookName, String authorName) {
	        this.bookId = bookId;
	        this.bookName = bookName;
	        this.authorName = authorName;
	    }

	    // Getters for book details
	    public int getBookId() {
	        return bookId;
	    }

	    public String getBookName() {
	        return bookName;
	    }

	    public String getAuthorName() {
	        return authorName;
	    }

	    // Method to display book details
	    public void displayBookDetails() {
	        System.out.println("Book ID: " + bookId + ", Book Name: " + bookName + ", Author Name: " + authorName);
	    }
	}

	  class BookName{
	    public static void main(String[] args) {
	        // Create an ArrayList to store Book objects
	        ArrayList<Book> bookList = new ArrayList<>();

	        // Adding Book objects to the ArrayList
	        bookList.add(new Book(1, "Super gene", " Twelve-Winged Dark Seraphim"));
	        bookList.add(new Book(2, "Indian Art and Culture", "Nitin Singhaniya"));
	        bookList.add(new Book(3, "The Discovery of India", "Jawahar Lal Nehru"));
	        bookList.add(new Book(4, "Glory of Indian Culture", " Giriraj Shah"));

	        // Display all book details using an enhanced for loop
	        System.out.println("Book Details:");
	        for (Book book : bookList) {
	            book.displayBookDetails();
	        }
	    }
	}

