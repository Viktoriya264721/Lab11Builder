package taskfirst;

import java.util.Arrays;

import java.util.Arrays;

public class Main {
    private static final int STUDENT_AGE = 19;

    public static void main(String[] args) {
        Student user = Student.builder()
                .name("Viktoriya")
                .age(STUDENT_AGE)
                .gender("f")
                // .mark(97)
                // .mark(67)
                // .grades(Arrays.asList(61, 62))
                .build();
        System.out.println(user);
    }
}
