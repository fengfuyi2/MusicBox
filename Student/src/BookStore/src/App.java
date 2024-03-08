import java.time.LocalDate;

public class BookStore {
    private String orderedBook;
    private LocalDate orderDate;
    private String orderID;
    private double transactionAmount;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String userID;
    private String orderType;

    public BookStore(String orderedBook, String firstName, String lastName, String emailAddress, String orderType) {
        this.orderedBook = orderedBook;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.orderType = orderType;
        this.orderDate = LocalDate.now();
        this.transactionAmount = findBookPrice(orderedBook);
        generateOrderID();
        generateUserID();
    }

    private void generateOrderID() {
        String datePart = orderDate.toString().replaceAll("-", "");
        String bookPart = orderedBook.length() > 3 ? orderedBook.substring(0, 3).toUpperCase() : orderedBook.toUpperCase();
        this.orderID = "ORD" + datePart + bookPart;
    }

    private void generateUserID() {
        String namePart = firstName.substring(0, Math.min(firstName.length(), 5)).toUpperCase() + lastName.substring(0, Math.min(lastName.length(), 5)).toUpperCase();
        this.userID = "USR" + namePart;
    }

    private double findBookPrice(String bookName) {
        for (BookDetails book : BookDetails.values()) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                return book.getBookPrice();
            }
        }
        return 0.0; 
    }

    public String getOrderID() {
        return orderID;
    }

    public String getUserID() {
        return userID;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public static void main(String[] args) {
        BookStore order = new BookStore("1984", "John", "Doe", "johndoe@example.com", "Purchase");
        System.out.println("Order ID: " + order.getOrderID());
        System.out.println("User ID: " + order.getUserID());
        System.out.println("Transaction Amount: $" + order.getTransactionAmount());
    }
}