package LeetCode.string.easy;

public class test_1160 {

    public int countCharacters(String[] words, String chars) {
        int[] c = new int[26];
        int[] tmp_c = new int[26];
        int res = 0 ;
        for(int i = 0 ; i < chars.length() ; i++){
            ++c[chars.charAt(i)-'a'];
            ++tmp_c[chars.charAt(i)-'a'];
        }
        int index = 0;
        for(int i = 0 ; i< words.length ; i++){
            for(int j = 0 ; j < words[i].length() ; j++){
                index = words[i].charAt(j)-'a';
                if(tmp_c[index]!=0){
                    --tmp_c[index];
                }else
                    break;

                if(j == words[i].length()-1)
                    res += words[i].length();
            }

            for(int k = 0 ; k < 26 ; k++){
                tmp_c[k]= c[k];
            }
        }

        return res;
    }

    public static void main(String[] args){
        test_1160 test_1160 = new test_1160();
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        test_1160.countCharacters(words,chars);
    }
}
