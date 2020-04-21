package LeetCode.match.match_177;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test_1360 {

    public int daysBetweenDates(String date1, String date2) throws ParseException {
        /*int a = 0;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parse_1 = simpleDateFormat.parse(date1);
            Date parse_2 = simpleDateFormat.parse(date2);
            a =  Math.abs((int)(parse_1.getTime() - parse_2.getTime())/(1000 * 60 * 60 * 24));
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

        try{
            SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
            Date d1 = format.parse(date1);
            Date d2 = format.parse(date2);
            return Math.abs((int)((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24)));
        } catch (ParseException e) {
            System.out.println("输入日期格式不对！！！");
        }
        return 0;

        //return a;
    }

    public static void main(String[] args) throws ParseException {
        test_1360 test_1360 = new test_1360();
        String date1 ="2010-09-23";
        String date2 ="1971-06-29";
        int res = test_1360.daysBetweenDates(date1,date2);
        return;
    }
}
