package Offer;

import java.util.*;

public class test_002 {


    public static void main(String[] args){

        int line_1_1,line_1_2;

        System.out.println("请输入数据：");

        List<Map<Integer,Integer>> list = new LinkedList<>();

        Scanner in = new Scanner(System.in);

        line_1_1 = in.nextInt();
        line_1_2 = in.nextInt();

        String  c = in.nextLine();
        /*String[] c_str = c.split(" ");

        line_1_1 = Integer.parseInt(c_str[0]);
        line_1_2 = Integer.parseInt(c_str[1]);*/

        //System.out.println("请输入接下来的面额和数：");
        //in.close();
        //  while(in.hasNextLine()){


        while (in.hasNext() ) {
            int f = in.nextInt();
            int g = in.nextInt();


            Map<Integer,Integer> tmp_map = new HashMap<>();
            tmp_map.put(in.nextInt(),in.nextInt());

        }

        for(int i = 0 ; i < line_1_1-1 ; i++ ){
            //Scanner in_2 = new Scanner(System.in);
            Map<Integer,Integer> tmp_map = new HashMap<>();

            //String  c = in.nextLine();

        }


        /*int j = 0;
        while (in.hasNext()){
            int f = in.nextInt();
            int g = in.nextInt();

            String str = in.nextLine();
            System.out.println(str);

            String[] numstr = str.split(" ");
            int[] nums = new int[numstr.length];

            for(int i = 0; i < numstr.length; i ++) {
                nums[i] = Integer.parseInt(numstr[i]);
            }
        }*/






        return ;


    }
}
