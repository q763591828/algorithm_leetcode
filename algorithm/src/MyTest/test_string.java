package MyTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test_string {
    public static void main(String[] args){
        String s1 = "casd";
        String s2 = "adsf";
        String s3 = "abcd";

        List<String>  list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        return;
    }
}
