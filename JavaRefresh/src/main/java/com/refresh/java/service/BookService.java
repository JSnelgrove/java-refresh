import org.springframework.stereotype.Service;

@Service
Public class BookRepository{
    private final BookRepository bookRepository;

    public BookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(long id){
        return bookRepository.deleteById(id);
    }

    public Optional<Book> getBookById(long id){
        return bookRepository.findById(id);
    } 

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}