import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Author {
    public Author(){

    }



    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    //YOUR CODE HERE


    public Author(String firstName, String lastName, String country, boolean isAlive, int age, List<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.books = books;
    }

    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE
    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;
    public List<Book> books;


    public static final String askFirstName = "What is your favorite author’s first name?";
    public static final String askLastName = "What is your favorite author’s last name?";
    public static final String askCountry = "Where is your favorite author from?";
    public static final String askIsAuthorAlive = "Is your favorite author alive? Y/N";
    public static final String askAge = "How old is your favorite author?";

    public static Author newAuthor(){

        String name = ScannerHelper.getString(askFirstName);
        String lName = ScannerHelper.getString(askLastName);
        String country = ScannerHelper.getString(askCountry);
        String isAuthorAlive = ScannerHelper.getString(askIsAuthorAlive);
        boolean isAlive = false;
        int age = 0;
        if (isAuthorAlive.equalsIgnoreCase("Y")) {
            isAlive = true;
            age = ScannerHelper.getInt(askAge);
        }
        else if (isAuthorAlive.toUpperCase().equals("N")) {
            isAlive = false;

        }

        ArrayList<Book> books = new ArrayList<>();
        do {
            String firstBook = ScannerHelper.getString(Book.askBookInfo);
            if (firstBook.equalsIgnoreCase("N")) break;
            books.add(Book.newBook());
        }while(true);

        return new Author(name, lName, country,isAlive , age ,books);

    }


    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                (age != 0 ? ", age=" + age : "") +
                '}';
    }
}