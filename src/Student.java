public class Student {
    public Integer id;
    public String name;
    public Integer age;
    public String location;
Student(){}
    public Student(Integer id, String name, Integer age, String location) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age
                + ", location=" + location + "]";
    }
}
