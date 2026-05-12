package copy;

public class DeepCopy {


    public static void main(String[] args) {

        User user = new User();

        user.setCity("LKO");
        user.setAge(32);
        user.setName("Abhinandan");

        User copied = new User(user);

        copied.setCity("Bangalore");

        System.out.println("Original " + user);

        System.out.println("Copied " + copied);


    }

}
