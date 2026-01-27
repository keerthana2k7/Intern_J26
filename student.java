class Student {
    String name;
    int age;
    String gender;
    int marks;

    Student(String name, int age, String gender, int marks) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.marks = marks;
    }

    static Student findTopper(Student[] students) {
        Student topper = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].marks > topper.marks) {
                topper = students[i];
            }
        }
        return topper;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Riya", 20, "Female", 91);
        Student s2 = new Student("Karthik", 21, "Male", 87);
        Student s3 = new Student("Meena", 19, "Female", 96);
        Student s4 = new Student("Surya", 22, "Male", 89);

        Student[] students = {s1, s2, s3, s4};

        Student topper = findTopper(students);

        System.out.println("Topper Details:");
        System.out.println("Name: " + topper.name);
        System.out.println("Age: " + topper.age);
        System.out.println("Gender: " + topper.gender);
        System.out.println("Marks: " + topper.marks);
    }
}
