package tasksecond;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private static int counter = 0;
    private int id;
    private String name;
    private String email;
    private int age;
    private Gender gender;

    public Client(String name, int age, String email, Gender gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.id = counter++;
    }

    public enum Gender {
        MALE, FEMALE
    }
}
