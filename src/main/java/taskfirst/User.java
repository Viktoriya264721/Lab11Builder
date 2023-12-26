package taskfirst;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
public class User {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String gender;
}
