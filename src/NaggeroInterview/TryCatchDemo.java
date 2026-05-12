package NaggeroInterview;

public class TryCatchDemo {

    public static void main(String[] args) {
        int i = check();
        System.out.println(i);
    }

    public static int check(){
        try{
            System.out.println("Try block");

//            System.exit(0);
            return 1;
        }catch (Exception e){
            System.out.println("Catch block");
            return 2;
        }finally {
            System.exit(0);
            System.out.println("Finally block");
            return 3;
        }
    }
}
