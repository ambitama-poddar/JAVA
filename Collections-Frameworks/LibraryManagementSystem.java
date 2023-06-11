// You are considering creating a library management system, 
// where librarians can keep track of the books they have, 
// the patrons borrowing the books, and the borrow/return dates. 
// Develop and test a Java program that uses HashMap, 
// with Book as the key and Patron as the value, 
// and implements methods where a librarian can add, remove, and update books and patrons to the system.

import java.util.HashMap;
import java.util.Map;

class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    @Override
    public String toString(){
        return "Title: " + this.title + "\nAuthor: " + this.author;
    }
}

class Patron{
    private String name;

    public Patron(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: " + this.name;
    }
}

class Library{
    private HashMap<Book, Patron> books;

    public Library(){
        this.books = new HashMap<Book, Patron>();
    }

    public void addBook(Book book, Patron patron){
        this.books.put(book, patron);
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }

    public void updatePatron(Book book, Patron newPatron){
        if(books.containsKey(book)){
            books.put(book, newPatron);
        }
        else{
            System.out.println("Book not found in the library.");
        }
    }

    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("No books in the library.");
        }
        else{
            System.out.println("Books in the library: ");
            for(Map.Entry<Book,Patron> entry : books.entrySet()){
                Book book= entry.getKey();
                Patron patron = entry.getValue();
                System.out.println(book+" - Borrowed by: "+patron);
            }
        }
    }
    
}

public class LibraryManagementSystem{
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien");
        Book book3 = new Book("The Hobbit", "J.R.R. Tolkien");

        Patron patron1 = new Patron("John");
        Patron patron2 = new Patron("Jane");

        library.addBook(book1, patron1);
        library.addBook(book2, patron2);
        library.addBook(book3, null);

        library.displayBooks();

        library.updatePatron(book1, patron2);

        library.displayBooks();

        library.removeBook(book2);

        library.displayBooks();
    }
}