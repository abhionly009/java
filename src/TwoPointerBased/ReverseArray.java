package TwoPointerBased;

public class ReverseArray {

    public <T> Object[] reverseArray(T[] value){

        int left =0;
        int right = value.length-1;

        while (left<right){
            T data = value[left];
            value[left] = value[right];
            value[right] = data;

            left++;
            right--;

        }

        return value;
    }

    public static void main(String[] args) {

        Integer [] arr = {1,2,4};

        Character [] ad = {'A','b','h','i','n','a','n','d','a','n'};

        ReverseArray array = new ReverseArray();
        Object [] ar = array.reverseArray(ad);

        for (Object a :ar){
            System.out.print(a);
        }

    }
}
