package java17;

/**
 * This is before java 17 if we had to define a pojo, DTO, or request/ response objects
 * kafka events and api payload
 */
public class Student {

    // @NotBlank validation
    // @Positive
    private final int id;

    // @NotBlank
    // @Min(value =5)
    private final String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
       return this.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
