import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Vasya",
                        Arrays.asList(new Course("Mathematics"),
                                    new Course("English"),
                                    new Course("Literature"))));
        studentList.add(new Student("Sveta",
                        Arrays.asList(new Course("Mathematics"),
                                    new Course("Physics"))));
        studentList.add(new Student("Olya",
                        Arrays.asList(new Course("English"),
                                    new Course("Literature"))));
        studentList.add(new Student("Maxim",
                        Arrays.asList(new Course("English"),
                                    new Course("Mathematics"),
                                    new Course("Physics"))));

        System.out.println(studentList.stream()
                .map(s -> s.getAllCourses())
                .flatMap(c -> c.stream())
                .map(n -> n.getName())
                .distinct()
                .collect(Collectors.toList())
        );

        System.out.println(studentList.stream()
                .sorted((c1, c2) -> c2.getAllCourses().size() - c1.getAllCourses().size())
                .limit(3)
                .map(s -> s.getName())
                .collect(Collectors.toList())
        );

        System.out.println(studentList.stream()
                .filter(s -> s.getAllCourses().contains(new Course("English")))
                .map(s -> s.getName())
                .collect(Collectors.toList())
        );
    }
}
