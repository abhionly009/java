package constructorsQuestion;

class Parent{

    Parent (){
        System.out.println(this.hashCode() +"Parent class" );
    }
}

class Child  extends Parent{
    Child(){
        System.out.println(this.hashCode() + "Child class ");
    }


}

public class constructorDemo {

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.hashCode() +" Main class");
    }
}
