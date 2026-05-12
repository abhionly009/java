package ListInterfaceDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) throws IOException {



        try(BufferedReader br = new BufferedReader
                (new FileReader("/Users/abhinandanshah/Desktop/input.rtf")))
        {

            System.out.println(br.readLine());
        }
    }
}
