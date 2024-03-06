package fa.training.service;

import fa.training.entity.Book;

import java.util.*;
import java.util.stream.Collectors;

public class BookService {
    public static final List<Book> bookList = new ArrayList<>();

    private BookService() {
    }

    public static void addBook(Book b) {
        if (getBookByIsbn(b.getIsbn()).isEmpty()) {
            bookList.add(b);
            System.out.println("Add successfully");
        } else {
            System.out.println("Isbn is available");
        }
    }

    public static Optional<Book> getBookByIsbn(String isbn) {
        return bookList.stream()
                .filter(book -> isbn.equals(book.getIsbn()))
                .findFirst();
    }

    public static void searchBook(String text) {
        List<Book> list = bookList.stream().filter(book -> book.getIsbn().equals(text) ||
                book.getAuthor().equals(text) || book.getPublister().equals(text)).collect(Collectors.toList());
        if (!list.isEmpty()) {
            list.forEach(Book::display);
        } else {
            System.out.println("No data");
        }

    }

    public static void getBookByYearAndPublisher(String publister, int year) {
        List<Book> list = bookList.stream().filter(book -> book.getPublister().equals(publister) && book.getPublicationYear() == year).collect(Collectors.toList());
        if(!list.isEmpty()){
            list.forEach(Book::display);
        } else{
            System.out.println("No data");
        }
    }


    public static void addAuthorBook(String author, String isbn) {
        for (Book b : bookList) {
            if (!getBookByIsbn(isbn).isEmpty()) {
                Iterator itr = b.getAuthor().iterator();
                while (itr.hasNext()) {
                    if(itr.next().equals(author)){
                        System.out.println("Author existed");
                        break;
                    }
                }
                b.updateAuthor(author);
                System.out.println("Add successfully");
            }
        }
    }

}
