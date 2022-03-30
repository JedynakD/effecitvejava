package effectivejava.chapter3.item15;

//mutable external class out of our control
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
