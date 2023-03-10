package yandexTask;
import java.util.Scanner;

/**
 *У одного из студентов в комнате живёт кузнечик, который очень любит прыгать по клетчатой одномерной доске.
 * Длина доски — N клеток. К его сожалению, он умеет прыгать только на 1, 2, …, k клеток вперёд.
 *
 * Однажды студентам стало интересно, сколькими способами кузнечик может допрыгать из первой клетки до последней.
 * Помогите им ответить на этот вопрос.
 *
 * Формат ввода
 * В первой и единственной строке входного файла записано два целых числа — N и k .
 *
 * Формат вывода
 * Выведите одно число — количество способов, которыми кузнечик может допрыгать из первой клетки до последней.
 *
 * Пример
 * Ввод	Вывод
 * 8 2
 * 21
 *-------------------------------------решение--------------------------------------
 * Эта программа считывает из стандартного потока ввода два целых числа n и k, и затем вычисляет количество способов,
 * которыми кузнечик может допрыгать из первой клетки до последней, используя динамическое программирование.
 * Решение использует одномерный массив dp, в котором dp[i] хранит количество способов допрыгать к клетке i.
 * Изначально dp[1] равно 1, так как кузнечик уже стоит на первой клетке. Затем мы перебираем все клетки
 *  от второй до последней и для каждой клетки перебираем все возможные длины прыжков от 1 до k
 *  (но не больше, чем расстояние до предыдущей клетки). Для каждой длины прыжка мы добавляем количество способов,
 *  которые кузнечик мог бы допрыгнуть, используя этот прыжок, к общему количеству способов для текущей клетки i.
 *  В конце мы выводим значение dp[n], которое содержит общее количество способов допрыгать до последней клетки.
 */

public class Grasshopper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] dp = new long[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= k && j <= i; j++) {
                dp[i] += dp[i - j];
            }
        }
        System.out.println(dp[n]);
    }
}