package Sep05;

import java.util.*;

public class SortArrayOnLastDigit {

    public static void main(String[] args) {
        Integer[] arr = {92,83,19,37,55,46}; // 92, 83,55,46,37,19
        Comparator<Integer> obj = (a,b)->a%10-b%10;
        Arrays.sort(arr,obj);
        System.out.println(Arrays.toString(arr));
    }
}
