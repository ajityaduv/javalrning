import java.util.*;

import javax.swing.ScrollPaneConstants;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(4); list2.add(9);
        mainlist.add(list);
        mainlist.add(list2);

        // System.out.println(mainlist);

        for(int i =0; i< mainlist.size(); i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j = 0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+ " ");
            }
            System.out.println();
        }
    }
}