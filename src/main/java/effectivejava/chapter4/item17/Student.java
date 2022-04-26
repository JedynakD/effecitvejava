package effectivejava.chapter4.item17;

import com.google.gson.Gson;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public final class Student {
    private final String name;
    private final Set<Book> books;
    private final Gson gson = new Gson();

    public Student(final String name, final Set<Book> books) {
        this.name = name;
        this.books = deepCopyBooks(books);
    }

    public Student addBook(Book book) {
        Set<Book> books = getBooks();
        books.add(deepCopyBook(book));
        return new Student(this.name, books);
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return deepCopyBooks(books);
    }

    private Book deepCopyBook(Book book) {
        return gson.fromJson(gson.toJson(book), Book.class);
    }

    private Set<Book> deepCopyBooks(Set<Book> books) {
        return books.stream()
                .map(this::deepCopyBook)
                .collect(Collectors.toSet());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(books, student.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
