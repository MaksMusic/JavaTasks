package Collections_and_Array;

import java.util.ArrayList;
import java.util.Random;

public class SearсhForDeletedElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);
        list.remove(new Random().nextInt(list.size())); //delete random elemenst
        ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();


        int element = searchDeleteElement(list,list2);
        System.out.println("delete element = " + element);
    }


    //временная сложность O(n*n)
    //сложность по памяти O(1)
    public static Integer searchDeleteElement(ArrayList<Integer> listOriginal, ArrayList<Integer> lisCopy) {
        for (int i = 0; i < listOriginal.size(); i++) {
            if (lisCopy.contains(listOriginal.get(i))){
                return listOriginal.get(i);
            }
        }
        return -1;
    }
}
