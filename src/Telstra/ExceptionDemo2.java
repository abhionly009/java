package Telstra;

import java.io.IOException;

public class ExceptionDemo2 {

    void check() throws RuntimeException{
        System.out.println("Check");
    }

    public static void main(String[] args) {
      ExceptionDemo2 demo2 = new ExceptionDemo2();
      demo2.check();
    }
}
