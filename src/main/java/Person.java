import java.util.Date;

public class Person {
    private String id;
    private String name;
    private String gender;
    private String dateBirth;
    private Division division;
    private String salary;


    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", division=" + division.toString() +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Person(String id, String name, String gender, String dateBirth, Division division, String salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateBirth = dateBirth;
        this.division = division;
        this.salary = salary;
    }
}
