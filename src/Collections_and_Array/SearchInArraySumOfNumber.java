package Collections_and_Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SearchInArraySumOfNumber {
    public static void main(String[] args) {
        int [] arr = new int[100];
        for (int i = 0; i < 100 ; i++) {
            arr[i] = new Random().nextInt(100);
        }

        Map<Integer,Integer>  answer = search(50,arr);
        System.out.println(answer);
    }

    // сложность по времени O(n*n)
    // сложность по памяти
    public static Map search(int n,int [] arry){
        Map<Integer,Integer> numbers = new HashMap<>();
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                if (arry[i] + arry[j] == n){
                    numbers.put(arry[i],arry[j]);
                }
            }
        }
        return numbers;
    }
}
