package Offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Offer_64 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(size < 1)
            return list;
        Deque<Integer> deque = new LinkedList();
        Queue<Integer> queue= new LinkedList<>();

        for(int i = 0 ; i < num.length ; i++){
            queue.add(num[i]);
            if(queue.size() > size){
                if(!deque.isEmpty() && queue.peek() == deque.peekFirst())
                    deque.pollFirst();
                queue.poll();
            }
            if(deque.isEmpty())
                deque.add(num[i]);
            else {
                if(num[i] > deque.peekFirst()){
                    deque.clear();
                    deque.add(num[i]);
                }else if(num[i] < deque.peekFirst() ){
                    if(deque.size() == 1 ){
                        deque.add(num[i]);
                    }else if(deque.size() > 1 && num[i] > deque.peekLast()){
                        deque.pollLast();
                        deque.add(num[i]);
                    }else {
                        deque.addLast(num[i]);
                    }
                }
            }

            if(queue.size() == size){
                list.add(deque.peekFirst());
            }
        }
        return list;
    }


    public static void main(String[] args){
        Offer_64 offer_64 = new Offer_64();
        int[] nums = {16,14,12,10,8,6,4};
        offer_64.maxInWindows(nums,5);
    }
}
