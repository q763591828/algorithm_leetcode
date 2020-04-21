package LeetCode.design;

import java.util.*;

public class LRUCache extends LinkedHashMap<Integer, Integer>{
    /*
     * 1.放入新元素0(1)
     *      1）如果没有满，直接放入并且是加入队列中
     *      2）如果满了，将最前面的删除，然后再加入队列中
     * 2.查找新元素0(1)
     *      使用map能做到0(1),这时要对之前的队列进行处理，将该元素放在队列首
     */

    /*private int limit;
    private int size;
    private Deque<Integer> queue;
    private Map<Integer,Integer> map;
    private Map<Integer,Integer> map_index;

    public LRUCache(int capacity) {
        queue = new  LinkedList<Integer>();
        limit = capacity;
        map = new HashMap<>();
        map_index = new HashMap<>();
    }

    public void remove_i(int i ) {
        queue.remove(i);
    }

    public int get(int key) {
        int index = map_index.get(key);
        queue.remove(index); //把该处的位置删除

        //重新添加在最后面
        queue.addLast(key);




        return map.get(key);
    }

    public void put(int key, int value) {
        if(size >= limit){
            queue.pollFirst();
        }
        queue.add(key);
        map_index.put(key,queue.size()-1);
        map.put(key,value);
        return;

    }*/

    private int cap;
    private Map<Integer, Integer> map = new LinkedHashMap<>();  // 保持插入顺序


    public int getCap() {
        return cap;
    }

    public Map<Integer, Integer> getMap() {
        return map;
    }


    public LRUCache(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        if (map.keySet().contains(key)) {
            int value = map.get(key);
            map.remove(key);
            // 保证每次查询后，都在末尾
            map.put(key, value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.keySet().contains(key)) {
            map.remove(key);
        }



        if(map.size() == cap){
            map.remove(key);
        }
        map.put(key, value);
    }


   /* private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }*/


    public static void main(String[] args){
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        //int a =lruCache.get(1);
        lruCache.put(3,3);
        //int b = lruCache.get(2);
        lruCache.put(4,4);
        //int c = lruCache.get(1);
        //int d = lruCache.get(3);
        //int e = lruCache.get(4);


        Set<Integer> set = lruCache.getMap().keySet();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            arrayList.add(iterator.next()) ;
        }

        return;
    }
}
