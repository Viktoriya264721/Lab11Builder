package taskfirst;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import lombok.Builder;

@SuperBuilder
@ToString
public class User {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String gender;
}
