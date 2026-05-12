package aaaaaaaaReflection;

import java.lang.reflect.Field;

public class UserReflectionDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        User user = new User();
       Class<?> userClass = user.getClass();

      Field field = userClass.getDeclaredField("name");
        field.setAccessible(true);

        String value = (String)field.get(user);
        System.out.println(value);

        field.set(user, "Ajay kumar");
        System.out.println(field.get(user));

    }
}
