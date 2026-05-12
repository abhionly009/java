package machineRound;

@FunctionalInterface
public interface Clickable {

    void click( String name);

    default void printName(String name) {
        System.out.println("You called for " + name);
    }

    static void callDemo(String data){

        System.out.println("your data is " + data);
    }
}
