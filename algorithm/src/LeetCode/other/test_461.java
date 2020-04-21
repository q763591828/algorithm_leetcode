package LeetCode.other;

public class test_461 {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);


    }

    public static void main(String[] args){
        int x = 93, y = 73;
        test_461 test = new test_461();
        test.hammingDistance(x,y);
    }
}
