package LeetCode.match.match_185;

import java.util.*;

public class test_5389 {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Map<String,Map<String,Integer>> maps = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });
        Set<String> cai_set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for(List<String > order : orders){

            String table_id = order.get(1);
            String cai_n = order.get(2);
            cai_set.add(cai_n);
            if(maps.containsKey(table_id)){
                Map<String, Integer> map = maps.get(table_id);
                if(map.containsKey(cai_n)){
                    int count = map.get(cai_n) + 1;
                    map.put(cai_n,count);
                }else {
                    map.put(cai_n,1);
                }

            }else{
                Map<String,Integer> map = new HashMap<>();
                map.put(cai_n,1);
                maps.put(table_id,map);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String, Map<String, Integer>> entry :maps.entrySet()){
            ArrayList<String> l = new ArrayList();
            l.add(entry.getKey());
            Iterator<String> iterator = cai_set.iterator();
            Map<String,Integer> map = entry.getValue();
            while (iterator.hasNext()){
                int tmp = map.getOrDefault(iterator.next(),0);
                l.add(String.valueOf(tmp));
            }
            res.add(l);
        }
        ArrayList table_cai = new ArrayList(cai_set);
        table_cai.add(0,"Table");
        res.add(0,table_cai);

        return res;

    }

    public static void main(String[] args){
        test_5389 test_5389 = new test_5389();
        List<List<String>> lists = new ArrayList<>();
        //Arrays.asList({,,{},{},{},{}});
        List l_1 = Arrays.asList("David","3","Ceviche");
        List l_2 = Arrays.asList("Corina","10","Beef Burrito");
        List l_3 = Arrays.asList("David","3","Fried Chicken");
        List l_4 = Arrays.asList("Carla","5","Water");
        List l_5 = Arrays.asList("Carla","5","Ceviche");
        List l_6 = Arrays.asList("Rous","3","Ceviche");
        lists.add(l_1);
        lists.add(l_2);
        lists.add(l_3);
        lists.add(l_4);
        lists.add(l_5);
        lists.add(l_6);
        test_5389.displayTable(lists);
    }
}

/*
Collections.sort(orders, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                String n_1 = o1.get(2);
                String n_2 = o2.get(2);

                int sub = n_1.hashCode() - n_2.hashCode();
                return sub;
            }
        });

        ArrayList<String > cai = new ArrayList<>();
        ArrayList<Integer > table = new ArrayList<>();
        Set<String > s_table = new HashSet<>();
        Set<String > s_cai = new HashSet<>();
        for(int i = 0; i < orders.size() ; ++i ){
            List<String > t = orders.get(i);
            if(!s_table.contains(t.get(1))){
                s_table.add(t.get(1));
                table.add(Integer.valueOf(t.get(1)));
            }

            if(!s_cai.contains(t.get(2))){
                s_cai.add(t.get(2));
                cai.add(t.get(2));
            }
        }
        Collections.sort(table, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        Collections.sort(cai, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.hashCode() - o2.hashCode();
            }
        });


        List<List<String>> lists = new ArrayList<>();
        cai.add(0,"Table");
        for(int i = 0; i < table.size() ; ++i){
            List<String> l = new ArrayList<>();
            l.add(String.valueOf(table.get(i)));
            lists.add(l);
        }
        for(int i = 0; i< orders.size(); ++i){
            lists.get(0);
        }
        return null;
 */
/*for(int i = 0; i < o1.size() ; i++){
                    char c_1 = n_1.charAt(i);
                    char c_2 = n_2.charAt(i);
                    if(c_1 != c_2)
                        return c_1-c_2;
                }*/