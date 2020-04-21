package GrammarTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args){


        List<int[]> res = new ArrayList<>();
        res.add(new int[] { 0, 1 });
        res.add(new int[] { 2, 3 });

        int[][] array =  res.toArray(new int[0][]);

        int[] a = {1,2};
        a = new int[a.length +1];

        return;


    }
}
