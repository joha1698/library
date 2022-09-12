@NoArgsConstructor
public @Data class Book {
    private String bookId;
    private String title;
    private String description;
    private String author;
    private String price;
    private int qty;

    public Book (String bookId, String title, String description, String author, String price, int qty){
        this.bookId = bookId;
        this.title = title;
        this.description = description;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
}
