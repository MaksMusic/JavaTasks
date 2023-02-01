package Collections_and_Array;

import java.util.Arrays;

public class SearchEuqalNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1,3,700,4,64,34,23,41,25,6,42,20,14,700,65,31,12};
        System.out.println(search(arr));
    }

    public static boolean search(int [] array){


        Arrays.sort(array);
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i]> maxValue){
                maxValue = array[i];
            }else if (array[i] == maxValue){
                return true;
            }

        }
        return false;
    }
}
