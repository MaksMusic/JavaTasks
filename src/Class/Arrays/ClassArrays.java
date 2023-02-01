package Class.Arrays;

import java.util.Arrays;

public class ClassArrays {
    public static void main(String[] args) {
        int [] ass1 = {1,6,2,3,4,5,6,7,8,9,10};
        int [] ass2 = {21,20,19,18,17,16,15,14,13,12,11,10};
        System.out.println(Arrays.toString(mergeAndSort(ass1,ass2)));

    }


    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        // новый массив длинной как 2 и копируем сразу туда 1 массив
        int[] array = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        // копируем второй массив вновь созданный

        System.arraycopy(secondArray, 0, array, firstArray.length, secondArray.length);
        Arrays.sort(array);
        return array;
    }
}