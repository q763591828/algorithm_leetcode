package Offer;

import java.util.*;

public class test_input {


    public static void main(String[] args){

        int line_1_1 = 0 ,line_1_2 = 0;
        List<Map<Integer,Integer>> lists = new LinkedList<>();

        System.out.println("请输入数据行数，和目标值：");

        Scanner scanner = new Scanner(System.in);

        line_1_1 = scanner.nextInt();
        line_1_2 = scanner.nextInt();


        /*int i = 0;
        while ( i < 3){
            System.out.println("haha");
            i++;
        }*/

        //System.out.println("请输入面额，和该面值的个数：");

        int scanner_num = 0;
        while ( scanner_num < line_1_1){
            Map<Integer,Integer> tmp_map = new HashMap<>();

            //System.out.println("刚输入的数字有："+ scanner.nextInt() + " 和 "+ scanner.nextInt());
            tmp_map.put(scanner.nextInt(),scanner.nextInt());
            lists.add(tmp_map);
            scanner_num++;
        }

        for(int i=0 ; i< lists.size() ; i++){
            System.out.println( lists.get(i));
        }



        return;

    }
}
