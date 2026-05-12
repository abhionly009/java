package copy;

public class GenericMethodDemo {

    public <T> void decor(T type ){

        System.out.println(type.getClass().getName());
        System.out.println(type.getClass().arrayType());
    }

    public static void main(String[] args) {

        GenericMethodDemo genericMethodDemo = new GenericMethodDemo();
        genericMethodDemo.decor(12);

    }
}
