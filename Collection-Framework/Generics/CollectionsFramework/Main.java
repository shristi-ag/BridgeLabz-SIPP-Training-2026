package CollectionsFramework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("----- Pair -----");

        Pair<String, Integer> pair =
                new Pair<>("Shristi", 21);

        System.out.println(pair);


        System.out.println("\n----- Stack -----");

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Peek : " + stack.peek());

        System.out.println("Pop : " + stack.pop());

        stack.display();
        System.out.println("\n----- Repository -----");

        Repository<Student> repository =
                new Repository<>();

        Student s1 = new Student(101, "Shristi", 90);
        Student s2 = new Student(102, "Rahul", 85);
        Student s3 = new Student(103, "Anjali", 95);

        repository.add(s1);
        repository.add(s2);
        repository.add(s3);

        repository.display();
        System.out.println("\n----- findMax() -----");

        Integer[] numbers = {10, 90, 30, 75, 50};

        Integer max =
                GenericUtility.findMax(numbers);

        System.out.println("Maximum = " + max);
        System.out.println("\n----- Wildcard -----");

        List<String> languages =
                Arrays.asList("Java", "Python", "C++");

        GenericUtility.printList(languages);
        System.out.println("\n----- ? extends Number -----");

        List<Integer> marks =
                Arrays.asList(80, 90, 95);

        System.out.println("Sum = "
                + GenericUtility.sum(marks));
        System.out.println("\n----- ? super Integer -----");

        List<Number> list =
                new ArrayList<>();

        GenericUtility.addNumbers(list);

        System.out.println(list);
        System.out.println("\n----- Generic Interface -----");

        StudentPrinter printer =
                new StudentPrinter();

        printer.print(s1);
        System.out.println("\n----- Generic Constructor -----");

        new Display("Hello Java");

        new Display(100);

        new Display(55.5);
        System.out.println("\n----- Streams -----");

        repository.getAll()
                .stream()
                .forEach(System.out::println);
    }
}