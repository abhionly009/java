package copy;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopy {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();



        User user5 = new User(31,"Shivani","Lucknow");
        users.add(user5);

        System.out.println(users);

        List<User> selectedUsers = new ArrayList<>();


        selectedUsers.add(user5);

        user5.setCity("Bangalore");
        user5.setName("Kunal");

        System.out.println("-------------------------");

        System.err.println(selectedUsers.toString());

        System.out.println(user5);


//        List<User> userList = new ArrayList<>();
//        User user = new User();
//        user.setAge(23);
//        user.setCity("LKO");
//        user.setName("Abhinandan");
//
//        System.out.println("Raw user "+user);
//        userList.add(user);
//
//        System.out.println("Raw user List "+userList);
//        user.setCity("Bangalore");
//        System.out.println("After update user "+user);
//
//        System.out.println("After Update userList "+userList);
//



    }

}
