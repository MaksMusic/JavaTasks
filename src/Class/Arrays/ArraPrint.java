package Class.Arrays;

public class ArraPrint {
    /**
     * вывести с массива не четные не отрицательные числа через запятую  и в конце чтоб  не стояла запятая
     */

    public static void main(String[] args) {
        int arr[] = {1,3,700,4,64,34,23,41,25,-6,42,20,14,700,65,-31,-12};
        printOddNumbers2(arr);
    }

    public static void printOddNumbers2 ( int[] arr){
        for (int i = 0; i < arr.length; i++) {

            if (i != 0  && i < arr.length - 2 && arr[i] % 2 != 0 ){
                System.out.print(",");
            }
            if (arr[i] % 2 != 0 && arr[i] >= 0 ) {
                if (i != arr.length-1){
                    System.out.print(arr[i]);
                }else {
                    System.out.print(arr[i]);
                }
            } else {

            }


        }


    }
}
