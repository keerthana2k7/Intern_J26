import java.util.List;

record Student1(String name, int age, String gender, int marks) {

    static Student1 findTopper(List<Student1> list) {
        return list.stream()
                .max((s1, s2) -> s1.marks() - s2.marks())
                .get();
    }
}

public class student1 {
    public static void main(String[] args) {

        Student1[] list = List.of(
                new Student1("Riya", 20, "Female", 91),
                new Student1("Karthik", 21, "Male", 87),
                new Student1("Meena", 19, "Female", 96),
                new Student1("Surya", 22, "Male", 89)
        ).toArray(new Student1[0]);

        Student1 topper;
        topper = Student1.findTopper(List.of(list));

        System.out.println("Topper: " + topper.name() + " Marks: " + topper.marks());
    }
}
