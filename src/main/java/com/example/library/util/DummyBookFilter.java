@Component
public class DummyBookFilter {
    private final BookService bookService;

    public DummyBookFilter(BookService bookService){
        this.bookService = bookService;
    }

    @PostConstruct
    public void int(){
        bookService.addBook(new Book(null, "El comienoz", "El mejor libro", "Juan", "$200", 6))
        bookService.addBook(new Book(null, "El lobo", "El magico libro", "Johana", "$400", 5))
        bookService.addBook(new Book(null, "El canto", "El aburrido libro", "Isa", "$500", 3))
        bookService.addBook(new Book(null, "El invierno", "El peor libro", "Laura", "$600", 1))

    
    
    }
    
}
