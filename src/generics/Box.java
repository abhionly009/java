package generics;

public class Box<T> {

    T value;

    public void set(T value ){
        this.value =value;
    }

    public T getValue(){
        return value;
    }


}
