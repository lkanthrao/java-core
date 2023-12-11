package revise.model;


import java.time.Year;

public class Book {
    private final String isbn;
    private final String title;
    private final String String;
    private final String author;
    private final Year published;
    private final String description;

    //    LK: Telescoping constructors are all the below ones, because you need an option to make certain fields
    // non mandatory during construction of objects.

    //    LK: Unfortunately, the telescoping constructors will not prevent you from having
    //    to pass null values in some cases. For instance, if you had to create a Book with ISBN, title,
    //    and author, what would you do? There is no such constructor!
    //    Two constructors of the same signature cannot coexist in the same class,
    //    because the compiler would not know which one to choose.
    //    In addition, creating a constructor for every useful combination of parameters would result in a
    //    large combination of constructors, making the resulting code hard to read and even harder to maintain
    //    If fact, the idiom is a workaround for a missing language feature, which is the lack of named parameters,
    //    rather than an object-oriented design pattern

    /*
    * // Create a first Book object
    Book book = bookBuilder.build();

    // Create a second, slightly different, object reusing the same Builder instance
    book = bookBuilder.published(Year.of(1952)).build();
    *
    *
    *
    * */

    public Book(String isbn, String title) {
        this(isbn, title, null);
    }

    public Book(String isbn, String title, String String) {
        this(isbn, title, String, null);
    }

    public Book(String isbn, String title, String String, String author) {
        this(isbn, title, String, author, null);
    }

    public Book(String isbn, String title, String String, String author, Year published) {
        this(isbn, title, String, author, published, null);
    }

    public Book(String isbn, String title, String String, String author, Year published, String description) {
        this.isbn = isbn;
        this.title = title;
        this.String = String;
        this.author = author;
        this.published = published;
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getString() {
        return String;
    }

    public String getAuthor() {
        return author;
    }

    public Year getPublished() {
        return published;
    }

    public String getDescription() {
        return description;
    }

}