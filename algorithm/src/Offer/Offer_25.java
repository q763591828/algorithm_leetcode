package Offer;

import java.util.HashSet;
import java.util.Set;

public class Offer_25 {

    RandomListNode copy_p = new RandomListNode(0);
    Set set = new HashSet();

    public RandomListNode create(RandomListNode pHead){
        if (pHead == null)
            return pHead;
        RandomListNode p = new RandomListNode(pHead.label);
        RandomListNode tmp = pHead.next;
        pHead.next = p;
        p.next = tmp;
        create(p.next);

        return pHead;
    }


    public void  connectRandom(RandomListNode pHead){
        RandomListNode p1= pHead;
        RandomListNode p2 = pHead.next;

        while (true){
            if(p1.random != null){
                p2.random = p1.random.next;
            }

            if(p2.next == null)
                break;

            p1=p2.next;
            p2=p2.next.next;
        }
    }

    public RandomListNode breakChain(RandomListNode pHead){

        RandomListNode p = pHead.next,result = p;
        while (true){
            pHead.next = p.next;
            if(p.next == null)
                break;
            p.next = p.next.next;

            pHead = pHead.next;
            p = p.next;
        }
        return result;
    }

    public RandomListNode Clone(RandomListNode pHead) {
        //直接复制节点
        //如果有要向下
        //然后将指针p 移动向下一个节点
        if(pHead == null)
            return null;
        create(pHead);
        connectRandom(pHead);
        return breakChain(pHead);
    }

    public static void main(String[] args){
        Offer_25 offer_25 = new Offer_25();
        RandomListNode pHead = new RandomListNode(1);

        RandomListNode p2 = new RandomListNode(2);
        RandomListNode p3 = new RandomListNode(3);
        RandomListNode p4 = new RandomListNode(4);
        pHead.next = p2;
        p2.next = p3;
        p3.next = p4;

        pHead.random = p3;
        p2.random = p4;

        RandomListNode p =offer_25.Clone(pHead);
        return;
    }
}
