package constructorsQuestion;

class Parent1 {
    String name;
    int age;

    Parent1(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class Child1 extends Parent1{

    int rollNo;
    Child1 (String name, int age, int rollNo){
        super(name,age);
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Child1{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SuperClassVariable {

    public static void main(String[] args) {

        Child1 child1 = new Child1("Abhinandan", 34, 4005);

        System.out.println(child1);

    }
}
