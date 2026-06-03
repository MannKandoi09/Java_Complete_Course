public class Book_51 {
    static int totalBooks;
    String title;
    String author;
    String isbn;

    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    { //Object Init
        totalBooks++;
    }


    Book_51(String Isbn, String Title, String Author){
        isbn = Isbn;
        title = Title;
        author = Author;

    }

    Book_51(String Isbn){
        this(Isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks(){
        return totalBooks;
    }

     void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is Already Borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy the Book..");
        }

    }

    void returnBook(){
        if (isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you Enjoyed the Book");
        }else{
            System.out.println("This Book is Already in Library");
        }
    }

    public static void main(String[] args) {
        Book_51 book = new Book_51("2","DSA","Mann Kandoi");
        Book_51 book1 = new Book_51("1", "Design", "Author");
        System.out.println(getTotalNoOfBooks());

        book.borrowBook();
        book1.borrowBook();
        book.borrowBook();
        book.returnBook();
        book.returnBook();
        System.out.println(getTotalNoOfBooks());

    }
}
