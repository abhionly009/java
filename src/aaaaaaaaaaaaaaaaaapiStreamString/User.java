package aaaaaaaaaaaaaaaaaapiStreamString;

public record User(String name, int age) {
   public User{
     if (age<18){
         throw new RuntimeException("Age must be greater than 18 or equal to 18");
     }
    }
}
