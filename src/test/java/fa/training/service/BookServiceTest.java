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
}
