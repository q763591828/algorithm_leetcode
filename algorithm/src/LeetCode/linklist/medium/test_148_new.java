package LeetCode.linklist.medium;

import LeetCode.linklist.LinkListTool;
import LeetCode.linklist.ListNode;

import java.util.ArrayList;

public class test_148_new {

    /*
     * 采用快速排序的方式（每一次直接找到一个点的最终位置）
     *
     * 1.找到首节点最终应该放在的位置
     *      如果发现首节点后面节点就是划分节点那么结束该步骤
     *      1）后续节点通过与首节点进行比较如果比首节点小则放在首节点前面如果比首节点大则放在首节点之后
     * 2.对首节点的前面和后面 进行再一次 找到首节点应该放在的位置
     *
     */
    public ArrayList<ListNode> partition(ListNode bef_p , ListNode head, ListNode last){
        if(head == null )
            return null;

        ListNode p_f = new ListNode(0); //方便的头结点
        p_f.next = head;
        ListNode p = head, p_next = head,p_l = head,p_mid= p_f;

        while(p!= last){
            if(p.val < head.val){
                ListNode tmp = p.next;
                p.next = p_f.next;
                p_f.next = p;
                p = tmp;
                p_next.next = tmp;

            }else {
                p_l = p;
                p_next = p;
                p = p.next;


            }
        }
        bef_p.next = p_f.next;

        //list
        // 第1个是 新的第一个节点
        // 第2个是 中间找出来位置的节点，
        // 第3个是 最后一个节点
        ArrayList<ListNode> list = new ArrayList<>();
        list.add(p_f.next);
        list.add(head);
        if(p_l != null){
            list.add(p_l.next);
        }else {
            list.add(null);
        }

        return list;
    }

    public void quickSort(ListNode p_f , ListNode head ,ListNode last){
        if(head == last || head.next == last)
            return;

        ArrayList<ListNode> list = partition(p_f,head,last);
        if(list == null)
            return;

        quickSort(p_f,list.get(0),list.get(1));
        quickSort(list.get(1),list.get(1).next,list.get(2));
    }



    public ListNode sortList(ListNode head) {
        ListNode p_f = new ListNode(0);
        p_f.next = head;
        quickSort(p_f,head,null);
        return p_f.next;
    }

    public static void main(String[] args){
        LinkListTool tool = new LinkListTool();
        int [] nums = {3,1,2,5,10,19,4,5
        };
        ListNode head = tool.generateLinkList(nums).next;
        test_148_new test_148_new = new test_148_new();
        test_148_new.sortList(head);
    }

}
