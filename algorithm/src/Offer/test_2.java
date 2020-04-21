package Offer;


import LeetCode.linklist.ListNode;

public class test_2 {

    public  static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sign =0;

        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode result = new ListNode(0) ;
        ListNode result_tmp = new ListNode(0);

        int tmp_1,tmp_10 = 0;


        if(p1==null ){
            return p2;
        }
        if(p2 == null){
            return p1;
        }

        while(p1 != null || p2 !=null || tmp_10 != 0){

            ListNode new_node = new ListNode(0);
            new_node.next = null;

            if(sign == 0){
                result.next = new_node;
                sign =1;
            }

            if(p1 == null && p2 !=null){
                tmp_1 = (p2.val + tmp_10)%10;

                new_node.val = tmp_1;
                result_tmp.next = new_node;

                tmp_10 = (p2.val + tmp_10)/10;


            }else if(p2 == null && p1 != null){
                tmp_1 = (p1.val + tmp_10)%10;

                new_node.val = tmp_1;
                result_tmp.next = new_node;

                tmp_10 = (p1.val + tmp_10)/10;

            }else if(p1 != null && p2!=null){
                tmp_1 = (p1.val+ p2.val + tmp_10)%10;

                new_node.val = tmp_1;
                result_tmp.next = new_node;

                tmp_10 = (p1.val+ p2.val + tmp_10)/10;
            }else if(p1 == null && p2 == null && tmp_10 != 0){
                new_node.val = tmp_10;
                result_tmp.next = new_node;
                tmp_10 =0;
            }

            if(p1 != null){
                p1 = p1.next;
            }else {
                p1 =null;
            }

            if(p2 != null){
                p2 = p2.next;
            }else{
                p2 = null;
            }

            result_tmp = result_tmp.next;
        }

        return result.next;
    }

    public static void  main(String[] args){
        ListNode l1 = new ListNode(5);
        //l1.next = new ListNode(8);
        ListNode l2 = new ListNode(5);

        addTwoNumbers(l1,l2);


    }

}
