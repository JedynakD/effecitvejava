package effectivejava.chapter2.item2;

public class Student {
    //required
    public final String id;

    //optional
    public final String firstName;
    public final String lastName;
    public final String age;

    private Student(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
    }

    public static class Builder {
        //required
        private final String id;

        //optional
        private String firstName;
        private String age;
        private String lastName;

        public Builder(String id) {
            this.id = id;
        }

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
