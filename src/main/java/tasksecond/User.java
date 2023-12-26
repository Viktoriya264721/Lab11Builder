package tasksecond;

public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;

    public User(String name, int age, Gender gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public enum Gender {
        MALE, FEMALE
    }

}
