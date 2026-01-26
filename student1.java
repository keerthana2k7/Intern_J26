import java.util.List;

record Student1(String name, int age, String gender, int marks) {

    static Student findTopper(List<Student> list) {
        return list.stream()
                .max((s1, s2) -> s1.marks() - s2.marks())
                .get();
    }
}

public class student1 {
    public static void main(String[] args) {

        Student[] list = List.of(
                new Student("Riya", 20, "Female", 91),
                new Student("Karthik", 21, "Male", 87),
                new Student("Meena", 19, "Female", 96),
                new Student("Surya", 22, "Male", 89)
        ).toArray(new Student[0]);

        Student topper;
        topper = Student.findTopper(list);

        System.out.println("Topper: " + topper.name() + " Marks: " + topper.marks());
    }
}
