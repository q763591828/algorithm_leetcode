package LeetCode.match.match_185;

import java.util.ArrayList;
import java.util.List;

public class test_5390 {

    List<List<Integer>> lists = new ArrayList<>();
    public void find(int i,int now_index){
        for(int j = 0 ; j < lists.size() ; ++j){
            List<Integer> l = lists.get(j);
            if(l.get(0) == i-1){
                l.set(0,i);
                if(i == 4){
                    l.add(now_index); //如果放完就表示有第3个结束下标
                }
            }
        }

    }

    public int minNumberOfFrogs(String croakOfFrogs) {
        for(int i = 0 ; i<croakOfFrogs.length() ; ++i){
            char c = croakOfFrogs.charAt(i);

            if(c == 'c' ){
                List<Integer> l = new ArrayList<>();
                l.add(0);
                l.add(i); //第2个数是开始下标
                lists.add(l);
            }else if( c == 'r'){
                find(1,i);
            }else if( c == 'o'){
                find(2,i);
            }else if( c == 'a'){
                find(3,i);
            }else if( c == 'k'){
                find(4,i);
            }
        }
        for(int i= 0 ;i < lists.size();){
            if(lists.get(i).size() < 3){
                return -1;
                // /lists.remove(i);
            }else {
                ++i;
            }
        }

        int ans = 0;
        for(int  i = 0 ; i < lists.size() ;++i){
            List<Integer> l_1 = lists.get(i);
            int e = l_1.get(2);
            for(int j = i+1 ;j < lists.size() ;){
                List<Integer> l_2 = lists.get(j);
                if(e < l_2.get(1) ) {
                    e = l_2.get(2);
                    lists.remove(j);
                }else {
                    j++;
                }
            }
        }

        return lists.size();
    }

    public static void main(String[] args){
        test_5390 test_5390 = new test_5390();
        //String s = "croakcroak";
        //227
        String s = "ccccccccccrrccccccrcccccccccccrcccccccccrcccccccccccrcccccrcccrrcccccccccccccrocrrcccccccccrccrocccccrccccrrcccccccrrrcrrcrccrcoccroccrccccccccorocrocccrrrrcrccrcrcrcrccrcroccccrccccroorcacrkcccrrroacccrrrraocccrrcrrccorooccrocacckcrcrrrrrrkrrccrcoacrcorcrooccacorcrccccoocroacroraoaarcoorrcrcccccocrrcoccarrorccccrcraoocrrrcoaoroccooccororrrccrcrocrrcorooocorarccoccocrrrocaccrooaaarrcrarooaarrarrororrcrcckracaccorarorocacrrarorrraoacrcokcarcoccoorcrrkaocorcrcrcrooorrcrroorkkaaarkraroraraarooccrkcrcraocooaoocraoorrrccoaraocoorrcokrararrkaakaooroorcororcaorckrrooooakcarokokcoarcccroaakkrrororacrkraooacrkaraoacaraorrorrakaokrokraccaockrookrokoororoooorroaoaokccraoraraokakrookkroakkaookkooraaocakrkokoraoarrakakkakaroaaocakkarkoocokokkrcorkkoorrkraoorkokkarkakokkkracocoaaaaakaraaooraokarrakkorokkoakokakakkcracarcaoaaoaoorcaakkraooaoakkrrroaoaoaarkkarkarkrooaookkroaaarkooakarakkooaokkoorkroaaaokoarkorraoraorcokokaakkaakrkaaokaaaroarkokokkokkkoakaaookkcakkrakooaooroaaaaooaooorkakrkkakkkkaokkooaakorkaroaorkkokaakaaaaaocrrkakrooaaroroakrakrkrakaoaaakokkaaoakrkkoakocaookkakooorkakoaaaaakkokakkorakaaaaoaarkokorkakokakckckookkraooaakokrrakkrkookkaaoakaaaokkaokkaaoakarkakaakkakorkaakkakkkakaaoaakkkaoaokkkakkkoaroookakaokaakkkkkkakoaooakcokkkrrokkkkaoakckakokkocaokaakakaaakakaakakkkkrakoaokkaakkkkkokkkkkkkkrkakkokkroaakkakaoakkoakkkkkkakakakkkaakkkkakkkrkoak";
        test_5390.minNumberOfFrogs(s);
    }
}
