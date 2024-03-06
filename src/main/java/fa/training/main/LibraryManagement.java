package fa.training.main;

import fa.training.entity.Book;
import fa.training.entity.Magazine;
import fa.training.service.BookService;
import fa.training.service.InitializeService;
import fa.training.service.ManazineService;
import fa.training.utils.ScannerUtils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryManagement {
    public static int getChoice(List<String> options) {
        int number;
        for (String i : options) {
            System.out.println(i);
        }
        System.out.print("Please choose an option 0..8: ");
        number = ScannerUtils.getInstance().nextInt();
        return number;
    }

    public static void main(String[] args) throws ParseException {
        List<String> listMenu = new ArrayList<>();
        listMenu.add("1 - Add a new Book");
        listMenu.add("2 - Add a new magazine");
        listMenu.add("3 - Display the list of all books and magazines");
        listMenu.add("4 - Add an author to a specific book");
        listMenu.add("5 - List of top 10 magazines by volumn");
        listMenu.add("6 - Search book");
        listMenu.add("0 - Exit");
        boolean exit = false;
        int choice;
        do {
            choice = getChoice(listMenu);
            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    String isbn = InitializeService.createStringValue();
                    System.out.print("Enter Author: ");
                    String author = InitializeService.createStringValue();
                    System.out.print("Enter publisher: ");
                    String publisher = InitializeService.createStringValue();
                    System.out.print("Enter publication year: ");
                    int publicationYear = InitializeService.createIntValue();
                    System.out.print("Enter publication date: ");
                    Date publicationDate = InitializeService.createDate();
                    System.out.print("Enter publication place: ");
                    String publicationPlace = InitializeService.createStringValue();
                    BookService.addBook(new Book(publicationYear,publisher, publicationDate, isbn, author, publicationPlace));
                    break;
                case 2:
                    System.out.print("Enter publisher: ");
                    String mpublisher = InitializeService.createStringValue();
                    System.out.print("Enter publication year: ");
                    int mpublicationYear = InitializeService.createIntValue();
                    System.out.print("Enter publication date: ");
                    Date mpublicationDate = InitializeService.createDate();
                    System.out.print("Enter Author: ");
                    String mauthor = InitializeService.createStringValue();
                    System.out.print("Enter volunm: ");
                    int volumn = InitializeService.createIntValue();
                    System.out.print("Enter edition: ");
                    int edition = InitializeService.createIntValue();
                    ManazineService.addMagazine(new Magazine(mpublicationYear, mpublisher, mpublicationDate, mauthor, volumn, edition));
                    break;
                case 3:
                    System.out.print("Enter publisher: ");
                    String dpublisher = InitializeService.createStringValue();
                    System.out.print("Enter publication year: ");
                    int dpublicationYear = InitializeService.createIntValue();
                    BookService.getBookByYearAndPublisher(dpublisher, dpublicationYear);
                    ManazineService.getBookByYearAndPublisher(dpublisher, dpublicationYear);
                    break;
                case 4:
                    System.out.print("Enter ISBN: ");
                    String aisbn = InitializeService.createStringValue();
                    System.out.print("Enter Author: ");
                    String aAuthor = InitializeService.createStringValue();
                    BookService.addAuthorBook(aAuthor, aisbn);
                    break;
                case 5:
                    ManazineService.getTop10();
                    break;
                case 6:
                    System.out.print("Enter text want search: ");
                    String text = InitializeService.createStringValue();
                    BookService.searchBook(text);
                    break;
                case 0:
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    break;
            }
            if (exit) {
                break;
            }
        } while ((choice > 0) && (choice <= 11));
    }
}

