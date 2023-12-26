package taskfirst;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student user = Student.builder()
                .name("Viktoriya")
                .age(19)
                .gender("f")
                .mark(97)
                .mark(67)
                .grades(Arrays.asList(61, 62))
                .build();
        System.out.println(user);
    }
}