package Collections_and_Array;

import java.util.Arrays;
import java.util.Random;

public class Numbers_not_in_Array {
    public static void main(String[] args) {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(arr.length+1);
        }

        int  [] arrAnswer = searchNumbers(arr);
        System.out.println("------------");
        System.out.println(Arrays.toString(arrAnswer));
    }

    //временная сложность O(n*n)
    public static int [] searchNumbers(int [] arr){
        int [] arrfull = new int [arr.length];
        for (int i = 0,j = 1; i < arr.length; i++,j++) {
            arrfull[i] = j;
        }
        System.out.println(Arrays.toString(arrfull));
        System.out.println(Arrays.toString(arr));

        int [] arrNumbersResult = new int[arr.length];

        int indexArrNumbersResult = 0;
        for (int i = 0; i < arrfull.length; i++) {
            boolean proverka = false;
            for (int j = 0; j < arr.length; j++) {

                if (arrfull[i]== arr[j]){
                    proverka = true;
                }
            }

            if (proverka == false && indexArrNumbersResult < arrNumbersResult.length) {
                arrNumbersResult[indexArrNumbersResult++] = arrfull[i];
            }

        }
    return arrNumbersResult;
    }
}
