package LeetCode.other;

import java.util.LinkedList;
import java.util.List;

public class test_019 {

    /*
     * 本题其实也可以用头插法 反转所有链表，当然也是需要额外的空间
     */


    public static  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null)
            return null;

        ListNode head_tmp = head;
        List<ListNode> listNodes = new LinkedList<>();
        int i =0;
        while (head_tmp!= null){
            ListNode tmp = new ListNode(i);
            listNodes.add(tmp);
            tmp.next = head_tmp;
            i++;
            head_tmp = head_tmp.next;
        }

        int find = i - n  ; //这是要删除的节点的位置

        if(find == 0 ){
            return  head = head.next;
        }else if(find == i - 1){
            listNodes.get(find -1 ).next.next = null;
            return head;
        }else {
            listNodes.get(find - 1).next.next = listNodes.get(find + 1).next;
            listNodes.get(find).next = null;
            return head;
        }


    }


    public static void main(String[] args ){
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);

        head.next = head2;

        head2.next = head3;
        head3.next = head4;
        head4.next = head5;

        removeNthFromEnd(head,2);
    }


}
