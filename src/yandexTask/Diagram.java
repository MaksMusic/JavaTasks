package yandexTask;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Формат ввода
 * Входной файл содержит зашифрованный текст сообщения.
 * Он содержит строчные и прописные латинские буквы, цифры, знаки препинания
 * («.», «!», «?», «:», «-», «,», «;», «(», «)»), пробелы и переводы строк.
 * Размер входного файла не превышает 10000 байт. Текст содержит хотя бы один непробельный символ.
 * Все строки входного файла не длиннее 200 символов.
 * Для каждого символа c кроме пробелов и переводов строк выведите столбик из символов «#»,
 * количество которых должно быть равно количеству символов c в данном тексте.
 * Под каждым столбиком напишите символ, соответствующий ему.
 * Отформатируйте гистограмму так, чтобы нижние концы столбиков были на одной строке,
 * первая строка и первый столбец были непустыми.
 * Не отделяйте столбики друг от друга. Отсортируйте столбики в порядке увеличения кодов символов.
 *
 *
 * Формат вывода
 * Для каждого символа c кроме пробелов и переводов строк выведите столбик из символов «#»,
 * количество которых должно быть равно количеству символов c в данном тексте.
 * Под каждым столбиком напишите символ, соответствующий ему. Отформатируйте гистограмму так,
 * чтобы нижние концы столбиков были на одной строке, первая строка и первый столбец были непустыми.
 * Не отделяйте столбики друг от друга. Отсортируйте столбики в порядке увеличения кодов символов.
 *
 *
 * ввод
 * Hello, world!
 *
 * ввывод
 *
 *     #
 *      ##
 * #########
 * !,Hdelorw
 */

public class Diagram {
    public static void main(String[] args) {
        String text = "";
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Admin\\IdeaProjects\\JavaTasks\\src\\yandexTask\\input.txt"));
            while (scanner.hasNextLine()) {
                text += scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Pattern pattern = Pattern.compile("\\w");
        Pattern pattern2 = Pattern.compile("\\W");

        Matcher matcher = pattern.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);

        Map<String, Integer> map = new TreeMap();

        while (matcher.find()) {
            String c = matcher.group();

            if (!c.equals(" ") && !(c.equals("\n"))) {
                int count = 1;
                if (!map.containsKey(c)) {
                    map.put(c, count);
                } else {
                    count = map.get(c) + 1;
                    map.put(c, count);
                }
            }
        }

        while (matcher2.find()) {
            String c = matcher2.group();
            if (!c.equals(" ") && !(c.equals("\n"))) {
                int count = 1;
                if (!map.containsKey(c)) {
                    map.put(c, count);
                } else {
                    count = map.get(c) + 1;
                    map.put(c, count);
                }

            }
        }

        String[] str = map.keySet().toArray(new String[0]);
        Integer[] value = map.values().toArray(new Integer[0]);

        //------------
        //int maxValue = map.values().stream().max(Integer::compare).get();
        int maxValue = value[0];
        for (int i = 1; i < value.length; i++) {
            if (value[i] > maxValue) {
                maxValue = value[i];
            }
        }
        //--------
        for (int i = 0, n = maxValue; i < maxValue; i++, n--) {
            for (int j = 0; j < str.length; j++) {
                if ((value[j]) >= n) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }

    }
}
