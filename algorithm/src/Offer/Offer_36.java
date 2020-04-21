package Offer;

import LeetCode.linklist.ListNode;
import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

import java.util.HashMap;
import java.util.Map;

public class Offer_36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        int n1 = 0 , n2 =0;
        ListNode p1 = pHead1,p2=pHead2;
        while (p1!=null){
            n1++;
            p1=p1.next;
        }

        while (p2!=null){
            n2++;
            p2 = p2.next;
        }


        int sub = n1-n2;
        if(sub > 0 ){
            p1 = pHead1;
            p2=pHead2;
        }else {
            p1 = pHead2;
            p2 = pHead1;
        }

        while (p1!=null && p2!= null){
            if(p1 == p2)
                return p1;
            else {
                p1=p1.next;
                if(sub == 0){
                    p2=p2.next;
                }else {
                    sub--;
                }

            }
        }
        return null;
    }

    public static void main(String[] args){
        Offer_36 offer_36 = new Offer_36();

    }

}
