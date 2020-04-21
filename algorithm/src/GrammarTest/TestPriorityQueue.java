package GrammarTest;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

    public static void main(String[] args){


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        
        priorityQueue.add(10);
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(13);

        int a = priorityQueue.poll();
        a = priorityQueue.poll();
        a= priorityQueue.poll();
        a = priorityQueue.poll();
        return;


    }
}
