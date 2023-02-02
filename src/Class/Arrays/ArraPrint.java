package Class.Arrays;

public class ArraPrint {
    /**
     * вывести с массива не четные не отрицательные числа через запятую  и в конце чтоб  не стояла запятая
     */

    public static void main(String[] args) {
        int arr[] = {1,3,700,4,64,34,23,41,25,-6,42,20,14,700,65,-31,12,8,8,8,7,6,5,-9};
        printOddNumbers3(arr);
    }

    public static void printOddNumbers2 ( int[] arr){
        for (int i = 0; i < arr.length; i++) {

            if (i != 0  && i < arr.length - 2 && arr[i] % 2 != 0 && arr[i+1] % 2 != 0){
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
    public static void printOddNumbers3 ( int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2 != 0){
                boolean n = false;

                for (int i1 = i+1; i1 < arr.length; i1++) {
                    if (arr[i1] <0){
                        n = false;
                        break;
                    }
                    if (arr[i1] %2 == 0 ){
                        n=false;
                        break;
                    }
                    n = true;
                }


                if (i == arr.length - 1){
                    System.out.println();
                    break;
                }else if(n == true && arr[i] % 2 != 0){
                    System.out.print(arr[i] + ",");
                }else {

                }



            }
        }
    }
}
