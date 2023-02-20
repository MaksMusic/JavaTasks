import java.util.Scanner;

/**
 *Пирамидальная сортировка
 *Формат ввода
 * Первая строка входных данных содержит количество элементов в массиве N, N ≤ 105. Далее задаются N целых чисел, не превосходящих по абсолютной величине 109.
 *
 * Формат вывода
 * Выведите эти числа в порядке неубывания.
 *
 * Пример 1
 * Ввод	Вывод
 * 1
 * 1
 * вывод
 * 1
 *
 *Пример 2
 * Ввод	Вывод
 * 2
 * 3 1
 *
 * вывод 1 3
 *
 *
 *
 */
public class Main {

    private static int[] heap;
    private static int heapSize;

    private static void buildHeap(int[] array) {
        heap = array;
        heapSize = heap.length - 1;
        for (int i = heapSize / 2; i >= 0; i--) {
            heapify(i);
        }
    }

    private static void heapify(int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int largest = i;

        if (left <= heapSize && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right <= heapSize && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    private static void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private static void heapSort(int[] array) {
        buildHeap(array);
        for (int i = heapSize; i > 0; i--) {
            swap(0, i);
            heapSize--;
            heapify(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        heapSort(array);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
