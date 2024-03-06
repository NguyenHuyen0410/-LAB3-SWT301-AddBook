package fa.training.entity;

import fa.training.utils.ValidatorUtils;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Book extends Publication {
    private String isbn;
    private HashSet<String> author = new HashSet<>();
    private String publicationPlace;

    public Book() {
    }

    public Book(String isbn, HashSet<String> author, String publicationPlace) {
        this.isbn = isbn;
        this.author = author;
        this.publicationPlace = publicationPlace;
    }

    public Book(int publicationYear, String publisher, Date publicationDate, String isbn, String author, String publicationPlace) {
        super(publicationYear, publisher, publicationDate);
        this.isbn = isbn;
        this.author.add(author);
        this.publicationPlace = publicationPlace;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublister() {
        return super.getPublisher();
    }

    public int getPublicationYear() {
        return super.getPublicationYear();
    }

    public Set<String> getAuthor() {
        return author;
    }

    public void setAuthor(HashSet<String> author) {
        this.author = author;
    }

    public void updateAuthor(String author) {
        this.author.add(author);
    }

    public String getPublicationPlace() {
        return publicationPlace;
    }

    public void setPublicationPlace(String publicationPlace) {
        this.publicationPlace = publicationPlace;
    }

    @Override
    public void display() {
        System.out.printf("ISBN = %s, Author = %s, Publication Place = %s, Publication Year = %d, Publication Date = %s, Publisher = %s\n",
                isbn, author, publicationPlace, super.getPublicationYear(), ValidatorUtils.dateToString(super.getPublicationDate()), super.getPublisher());
    }
}
