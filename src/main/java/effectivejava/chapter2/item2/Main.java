package effectivejava.chapter2.item2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student.Builder("someId")
                .age("20")
                .firstName("firstName")
                .lastName("lastName")
                .build();
    }
}
