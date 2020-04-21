package LeetCode.other;


public class test_237 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
        if(node!=null){
            node.val = node.next.val;
            node.next = node.next.next;

        }

    }

    public static void main(String[] args){
        test_237 test = new test_237();
        //test.deleteNode();

    }

}
