package machineRound;

public class MainClass {


    public static void main(String[] args) {

        Clickable clickable = (name)->System.out.println( name+ " Click");

        clickable.click("Hello");

        clickable.printName("Abhinandan");

        Clickable.callDemo("AllState");
    }
}
