package CollectionsFramework;
public class StudentPrinter implements Printer<Student> {

    @Override
    public void print(Student obj) {

        System.out.println("Student Details");
        System.out.println(obj);

    }
}