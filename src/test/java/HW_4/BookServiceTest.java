package HW_4;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


class BookServiceTest {

        BookRepository mockRepository;
        BookService bookService;

        @Test
        void findBookById() {
            mockRepository = Mockito.mock(BookRepository.class);
            bookService = new BookService(mockRepository);
            bookService.findBookById("1");
            verify(mockRepository, times(1)).findAll();
        }

        @Test
        void findAllBooks() {
            mockRepository = Mockito.mock(BookRepository.class);
            bookService = new BookService(mockRepository);
            bookService.findAllBooks();
            verify(mockRepository, times(1)).findAll();
        }
}