package fa.training.service;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import fa.training.entity.Book;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BookServiceTest {

    @Test()
    void addBookWhenGetBookByIsbnBGetIsbnIsEmpty() {
        Book book = new Book();
        book.setIsbn("isbn1");
        BookService.addBook(book);
    }

    @Disabled()
    @Test()
    void getBookByIsbnTest() {
        Optional<Book> result = BookService.getBookByIsbn("isbn1");
        Optional<Book> bookOptional = Optional.empty();
        assertAll("result", () -> assertThat(result, equalTo(bookOptional)));
    }

    @Disabled()
    @Test()
    void searchBookWhenListNotIsEmpty() {
        BookService.searchBook("text1");
    }

    @Disabled()
    @Test()
    void searchBookWhenListIsEmpty() {
        BookService.searchBook("text1");
    }

    @Disabled()
    @Test()
    void getBookByYearAndPublisherWhenListNotIsEmpty() {
        BookService.getBookByYearAndPublisher("publister1", 0);
    }

    @Disabled()
    @Test()
    void getBookByYearAndPublisherWhenListIsEmpty() {
        BookService.getBookByYearAndPublisher("publister1", 0);
    }

    @Test()
    void addAuthorBookWhenBookListIsEmpty() {
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthorBookWhenBookListIsNotEmpty() {
        Book book = new Book();
        book.setIsbn("isbn1");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthorBookWhenAuthorExisted() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author1");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor1() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor2() {
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor3() {
        Book book = new Book();
        book.setIsbn("isbn1");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor4() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author1");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor5() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor6() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor7() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor8() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor9() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor10() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor11() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor12() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor13() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor14() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor15() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor16() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor17() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor18() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor19() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor20() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor21() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor22() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor23() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor24() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor25() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor26() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor27() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor28() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor29() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor30() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }

    @Test()
    void addAuthor31() {
        Book book = new Book();
        book.setIsbn("isbn1");
        book.setPublisher("author2");
        BookService.addBook(book);
        BookService.addAuthorBook("author1", "isbn1");
    }
}
