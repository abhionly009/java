package java17;

public class RecordsExample {

    public static void main(String[] args) {


        /**
         *  Student object traditional approach
         */
        Student student = new Student(12,"Abhinandan");
        Student student1 = new Student(13,"Sunita");

        System.out.println(student);
        System.out.println(student1);


        /**
         *
         * Student object with records
         *
         */

        StudentRecord studentRecord = new StudentRecord(14,"Shivam");
        StudentRecord studentRecord1 = new StudentRecord(23,"Anshu");

        System.out.println(studentRecord.id());
        System.out.println(studentRecord1.id());

        System.out.println(studentRecord.name());
        System.out.println(studentRecord1.name());


        System.out.println(studentRecord);
        System.out.println(studentRecord1);
    }
}
