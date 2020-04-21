package Offer;

import LeetCode.linklist.ListNode;

import java.util.ArrayList;

public class Offer_03_new {

    private ArrayList list = new ArrayList();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        if(listNode == null)
            return list;

        printListFromTailToHead(listNode.next);
        list.add(listNode.val);
        return list;
    }



}
