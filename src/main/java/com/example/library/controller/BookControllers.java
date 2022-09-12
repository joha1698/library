@RestController
@RequestMapping({"book"})
public class BookControllers {
    private final BookService bookService;

    public BookControllers(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("")
    public Book get(String bookId){
        return bookService.get(bookId)
    }

    @GetMapping("")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }
}
