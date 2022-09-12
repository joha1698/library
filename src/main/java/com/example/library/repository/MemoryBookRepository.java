public class MemoryBookRepository implements BookRepository {

    Map <String, Book> booksMap;

    public MemoryBookRepository(){
        booksMap = new HashMap();
    }
    
    @Override
    public Book get(String bookId){
        return booksMap.get(bookId)
    };

    @Override
    public List<Book> getAll()(String bookId){
        List<Book> books = new ArrayList();
        books.addAlls(booksMap.value());
        return books
    };

    @Override
    public List<Book> findByAuthor(String author){
        //Forma 1:
        
        List<Book> ret = new ArrayList();
        for(String bookId : booksMap.keyset()){
            
            Book book = booksMap.get(bookId)
            if(book.getAuthor().equals(author)){
                ret.add(book)
            }
        }
        return ret

        //Forma 2: con esta forma le pedimos que nos regrese el indice de la cadena que estoy pasando
        //si esa cadena no existe, se regresa -1
        List<Book> ret = new ArrayList();
        for(Book book : booksMap.value()){

            if(book.getAuthor().indexOf(author) >= 0){
                ret.add(book)
            }
        }
        return ret

        //Forma 3: con stream, es como si yo pasara los resultados por una librería
        return booksMap.values().stream()
                .filter(book -> book.getAuthor().toLowerCase().indexOf(author.toLowerCase()) >= 0)
                .collect(Collectores.toList());

    }

    };

    @Override
    public Book save(Book book){
        //Para identificar si el libro es nuevo o ya existe, podemos verificar si el objeto
        //ya tiene la propiedad bookId

        if(book.getBookID() == null){
            book.setBookId(String.valueOf(System.currentTymeMillis()))
        }
        booksMap.put(book.getBookId(), book);
        
         return book;
    };

    @Override
    public Book delete(Book bookId){
        booksMap.remove(bookId)
    };
}
