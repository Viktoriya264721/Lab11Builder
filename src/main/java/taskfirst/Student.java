package taskfirst;

import java.util.List;

import lombok.Singular;
import lombok.ToString;
// import lombok.toString;
import lombok.experimental.SuperBuilder;
import lombok.Builder;

@SuperBuilder @ToString(callSuper = true)
public class Student extends User {
    @Singular("mark")
    private List<Integer> grades;
}