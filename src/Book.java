
public class Book {

    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
     Create a custom constructor that will take 3 args and defines the Book object
     Define Book class fields as name, genre, totalPage
     */

    //Create 3 args custom constructor here
    //YOUR CODE HERE

    public Book(String name, String genre, int totalPrice) {
        this.name = name;
        this.genre = genre;
        this.totalPage = totalPrice;
    }

    //Define instance variables here
    //YOUR CODE HERE
    public String name;
    public String genre;
    public int totalPage;

    public static final String askBookInfo = "Would you like enter book information? (Y/N)";
    public static final String askBookName = "What is the book name?";
    public static final String askBookGenre = "What is genre of the book?";
    public static final String askBookPages = "How many pages does book have?";



        public static Book newBook(){

                    String bookName = ScannerHelper.getString(askBookName);
                    String bookGenre = ScannerHelper.getString(askBookGenre);
                    int bookPages = ScannerHelper.getInt(askBookPages);

                    return new Book(bookName, bookGenre, bookPages);
        }

    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPrice=" + totalPage +
                '}';
    }
}