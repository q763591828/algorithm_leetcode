package LeetCode.other;

import sun.awt.SunHints;

public class test_021 {

    public static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        int min = Integer.MIN_VALUE;
        ListNode listNode_l1 = new ListNode(min),listNode_l2 = new ListNode(min) , head_l1 , head_l2 , merge_List = new ListNode(min);
        listNode_l1.next = l1;
        listNode_l2.next = l2;
        head_l1 = listNode_l1;
        head_l2 = listNode_l2;

        while (head_l1!= null || head_l2!= null ){

            //判断是否有空链的情况
            if(head_l1 == null && head_l2 != null){
                merge_List.next = head_l2;
                break;
            }else if(head_l2 == null && head_l1 != null){
                merge_List.next = head_l1;
                break;
            }
            //无空链的情况
            if(head_l1.val <= head_l2.val){
                merge_List.next = head_l1;
                merge_List = head_l1;
                head_l1 = head_l1.next;

            }else {
                merge_List.next = head_l2;
                merge_List = head_l2;
                head_l2 = head_l2.next;

            }

        }

        return listNode_l1.next.next;
    }

    public static void main(String[] args){

        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(4);

        ListNode head4 = new ListNode(1);
        ListNode head5 = new ListNode(3);
        ListNode head6 = new ListNode(4);

        head.next = head2;
        head2.next = head3;

        head4.next = head5;
        head5.next = head6;

        mergeTwoLists(head,head4);

    }
}
