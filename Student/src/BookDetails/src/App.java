public enum BookDetails {
    BOOK1("The Great Gatsby", "F. Scott Fitzgerald", 218, "Classic", 8.5, 1925, "Charles Scribner's Sons", 10.0),
    BOOK2("1984", "George Orwell", 328, "Dystopian", 9.0, 1949, "Secker & Warburg", 15.0);

    private final String bookName;
    private final String bookAuthor;
    private final int bookPages;
    private final String bookGenre;
    private final double bookRating;
    private final int bookPublishedYear;
    private final String bookPublisher;
    private final double bookPrice;

    BookDetails(String bookName, String bookAuthor, int bookPages, String bookGenre, double bookRating, int bookPublishedYear, String bookPublisher, double bookPrice) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPages = bookPages;
        this.bookGenre = bookGenre;
        this.bookRating = bookRating;
        this.bookPublishedYear = bookPublishedYear;
        this.bookPublisher = bookPublisher;
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookPages() {
        return bookPages;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public double getBookRating() {
        return bookRating;
    }

    public int getBookPublishedYear() {
        return bookPublishedYear;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public double getBookPrice() {
        return bookPrice;
    }
}
