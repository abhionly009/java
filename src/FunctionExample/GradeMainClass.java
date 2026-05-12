package FunctionExample;

import java.util.function.Function;
import java.util.function.Predicate;

public class GradeMainClass {

    public static void main(String[] args) {


        Student [] s = {
                new Student("Durga",100),
                new Student("Sunny",65),
                new Student("Bunty",42),
                new Student("Lokesh",98),
                new Student("komal",30)

        };

        Function<Student,String> gradeFunction = std->{

            int marks = std.getMarks();
            String grade = "";
            Predicate<Integer>  distinction = i-> i>=80;
            Predicate<Integer> firstClass = i->i>=60;
            Predicate<Integer> secondClass = i->i>=50;
            Predicate<Integer> thirdClass = i->i>=35;

            if (distinction.test(marks))
                grade = "A[Distinction]";
            else if (firstClass.test(marks))
                grade = "B[Second Class]";
           else if (secondClass.test(marks))
                grade = "C[Second Class]";
           else if (thirdClass.test(marks))
                grade = "D[Third Class]";
            else
                grade = "Failed";

            return grade;
        };

        for(Student student:s){
            System.out.println(student.getName());
            System.out.println(student.getMarks());
            System.out.println(gradeFunction.apply(student));

            System.out.println("-------------------------");
        }

    }
}
