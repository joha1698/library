@Service
public class BookService {
    private final BookRepository bookRepository;

    //Genereamos el constructor. De esta forma seva a generar el @Autowired automaticamente 
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    //Vamos a traer todos los métodos disponibles

    //Traer un libro
    public Book getBook(String bookId){
        return bookRepository.get(bookId)
    }

    //Traer todos los libros 
    public List<Book> getAll(){
        return bookRepository.getAll()
    }

    //Taer libros por autor
    public List<Book> findByAuthor(String author){
        return bookRepository.findByAuthor(author)
    }

    //Guardar un libro
    public Book addBook(Book book){
        book.setBookId(null);
        return bookRepository.save(book)
    }

    //Actualizar un libro
    public Book updateBook(String bookId, Book book){
        Book bookR = bookRepository.get(bookId);
        if(bookR == null){
            return null
        }else{
            book.setBookId(bookId);
            return bookRepository.save(book);
        }
    }

    //Borrar un libro
    public Book deleteBook(String bookId){
        return bookRepository.delete(bookId)
    }


}
