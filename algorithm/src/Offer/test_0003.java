package Offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class test_0003 {

    public static void main(String[] args){
        System.out.println("请输入数据行数，和目标值：");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(),k=scanner.nextInt(),ms = scanner.nextInt(), me = scanner.nextInt();

        List<Integer> list_s = new LinkedList<>(), list_e = new LinkedList<>();

        int tmp_i = 0 ;
        //while (){
        for(int i = 0 ; i< n ; i++){
            list_s.add(scanner.nextInt());
        }

        for(int i = 0 ; i < n ; i++){
            list_e.add(scanner.nextInt());
        }
        //}

        int sign[] = new int[n];
        int dis[] = new int[n];
        int sum = 0 ;
        int now_ms = 0;
        int now_me = 0;

        /*for(int i = 0 ; i < n ; i++){
            if(list_s.get(i) >= list_e.get(i)){
                sum += list_s.get(i);
                sign[i] = 0;
            }else {
                sum += list_e.get(i);
                sign[i] = 1;
            }
        }*/
        for(int i = 0 ; i< n ; i++){
            int tmp = list_s.get(i) - list_e.get(i);
            if(tmp >= 0 ){
                sum += list_s.get(i);
                sign[i] = 0;
                dis[i] = tmp;
                now_ms += list_s.get(i);
            }else{
                sum += list_e.get(i);
                sign[i] = 1;
                dis[i] = tmp;
                now_me += list_e.get(i);
            }
        }



        System.out.println(sum);
        for(int i = 0 ; i < n ; i++){
            if(sign[i] == 0){
                System.out.print("S");
            }else {
                System.out.print("E");
            }
        }

        while (now_ms < ms){
            int min = 10000;
            for(int i = 0 ; i < n ; i++){
                //if( d)
            }
        }

        while(now_me < me){

        }







        return ;
    }
}
