public interface BookRepository {
   
    //Obtener un libro
    public Book get(String bookId);
   
    //Obtener todos los libros
    public List<Book> getAll();

    //Obtener todos los libros de un autor
    public List<Book> findByAuthor(String author);

    //Guardar un libro
    public Book save(Book book);

    //Borrar un libro
    public Book delete(Book bookId);
}
