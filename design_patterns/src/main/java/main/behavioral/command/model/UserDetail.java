package main.behavioral.command.model;

public class UserDetail {

    private String name;
    private String surname;
    private Integer age;

    public UserDetail(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
