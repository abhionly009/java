package atomic;

public class NormalCounter {

    int count =0;
    public int increment(){
        return ++count;
    }
}
