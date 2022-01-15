package training;

class Person {
    String lastName;
    String firstName;

    String getLastName() {
        return lastName;
    }

    String getFirstName() {
        return firstName;
    }

    Person(String lastName, String firstName) {
        this.lastName = lastName; // this는 현재 객체를 가리킨다.
        this.firstName = firstName; // this는 현재 객체를 가리킨다.
    }

    String buildName() {
        return String.format("%s %s \n", this.getLastName(), getFirstName());
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("홍", "길동");
        System.out.println(person.buildName());
    }
}
