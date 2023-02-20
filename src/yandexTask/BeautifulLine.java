package yandexTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BeautifulLine {
    public static void main(String[] args) {
        int number= 0;
        String text = "";
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Admin\\IdeaProjects\\JavaTasks\\src\\yandexTask\\input2.txt"));
            number = scanner.nextInt();
            scanner.nextLine();
            text = scanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int [] arrNumber = new int[number];
        for (int i = 0; i < arrNumber.length; i++) {
            arrNumber[i] = i+1;
        }
        int max = 0;
        var c = text.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int i1 = 0; i1 < arrNumber.length; i1++) {
                if (c.length > i+arrNumber[i1]){

                    c[i + arrNumber[i1] ] = c[i];

                    HashMap<String,Integer> map = new HashMap<>();
                    for (int j = 0; j < c.length; j++) {
                        if (map.containsKey(String.valueOf(c[j]))){
                            map.put(String.valueOf(c[j]),map.get(String.valueOf(c[j]))+1);
                        }else {
                            map.put(String.valueOf(c[j]),1);
                        }

                        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
                            if (stringIntegerEntry.getValue() > max){
                                max = stringIntegerEntry.getValue();
                            }

                        }
                    }
                }
            }
        }


        System.out.println(max);


    }
}
