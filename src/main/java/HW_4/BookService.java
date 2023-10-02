package HW_4;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBookById(String id) {
        return this.bookRepository.findById(id);
    }

    public List<Book> findAllBooks() {
        return this.bookRepository.findAll();
    }
}

