package Offer;

import java.util.ArrayList;


public class Offer_03 {
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {


        ListNode p_null = new ListNode(0);
        //p_null.next = listNode;
        ListNode p = listNode, next_p = listNode , tmp_p ;

        while(p != null){

            next_p = p.next;

            tmp_p = p_null.next;
            p_null.next = p;
            p.next = tmp_p;

            p = next_p;

        }

        ArrayList result = new ArrayList<Integer>();
        ListNode p_result = p_null.next;
        while(p_result != null){
            result.add(p_result.val);
            p_result = p_result.next;
        }


        return result;


        //return null;
    }

    public static void main(String[] args){


        /*List<List<Integer>> lists = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        lists.add(list);

        List<Integer> tmp_list = new LinkedList<>(list);
        lists.add(tmp_list);
        list.remove(2);*/




        ListNode a_1 = new ListNode(1);
        ListNode a_2 = new ListNode(2);
        a_1.next = a_2;
        ListNode a_3 = new ListNode(3);
        a_2.next = a_3;

        printListFromTailToHead(a_1);
        return;
    }
}
