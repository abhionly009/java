import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CG {


    public static void main(String[] args) {

        List<String> lines = Arrays.asList(
        "aaa bcd",
        "hjk mmo",
        "kkl nnn"
);

        List<String[]> list = lines.stream().map(str -> str.split(" ")).toList();

        for(String st :lines){
            System.out.println(st);
        }


    }
}


//List<String> lines = Arrays.asList(
//        "aaa bcd",
//        "hjk mmo",
//        "kkl nnn"
//);

// [aaa, mmo, kkl, nnn]
