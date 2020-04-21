package Offer;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Offer_29 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input.length==0 || k == 0 || k>input.length)
            return list;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i< input.length ; i++){
            pq.add(input[i]);
        }
        for(int i = 0 ; i < k ; i++){
            list.add(pq.poll());
        }
        return  list;
    }

    public static void main(String[] args){
        int[] nums = {4,5,1,6,2,7,3,8};
        Offer_29 offer_29 = new Offer_29();
        offer_29.GetLeastNumbers_Solution(nums,11);
    }


}
