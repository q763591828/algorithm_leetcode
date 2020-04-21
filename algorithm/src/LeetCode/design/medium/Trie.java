package LeetCode.design.medium;

import java.util.LinkedList;

public class Trie {

    /*
     * 本题使用数组作为节点效率会更高。因为最多一层就26个节点所以可以多分配空间来换取速度
     */
    String word;

    /** Initialize your data structure here. */
    class Node{
        char c;
        LinkedList<Node> nexts = new LinkedList();
        int sign = 0;

        public Node(char c){
            this.c = c;
        }
    }

    Node root = new Node(' ');

    public Trie() {
    }

    private Node findnext(char c,LinkedList<Node> nexts){
        for(int i = 0 ; i < nexts.size() ; i++){
            if(c == nexts.get(i).c){
                return nexts.get(i);
            }
        }
        return null;
    }

    private void solve(Node root  , int i){
        if(i >= word.length()) {
            root.sign = 1;
            return;
        }
        Node next = findnext(word.charAt(i),root.nexts);
        if(next == null) {
            Node create_node = new Node(word.charAt(i));
            root.nexts.add(create_node);
            solve(create_node,i+1);
        }else {
            solve(next,i+1);
        }

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        /*
         * 从根节点找是否有下一个节点
         *  如果有重复上一步
         *  如果没有创建新节点
         */
        this.word = word;
        solve(root,0);
    }

    public boolean find(Node root , int index){
        if(index >= word.length()){
            if(root.sign == 1 ){
                return true;
            }else
                return false;
        }
        char c = word.charAt(index);
        Node next = findnext(c,root.nexts);
        if(next == null)
            return false;
        else
            return find(next,index+1);
    }


    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        this.word = word;
        return find(root,0);
    }


    private boolean findstarts(Node root,int index){
        if(index >= word.length()){
            return true;
        }
        char c = word.charAt(index);
        Node next = findnext(c,root.nexts);
        if(next == null)
            return false;
        else
            return findstarts(next,index+1);
    }
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        this.word = prefix;
        return findstarts(root,0);
    }


    public static void main(String[] args){
        Trie trie = new Trie();
        trie.insert("apple");
        boolean a = trie.search("apple");   // 返回 true
        boolean b = trie.search("app");     // 返回 false
        boolean c = trie.startsWith("app"); // 返回 true
        trie.insert("app");
        boolean d = trie.search("app");     // 返回 true
        boolean m = trie.search("applef");     // 返回 true

        trie.insert("aee");
        boolean e = trie.search("aee");
        boolean f = trie.search("ae");
        boolean g = trie.startsWith("ae");

        return;
    }
}
