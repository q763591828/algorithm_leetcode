package LeetCode.other;

public class test_1108 {
    public String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i< address.length() ;i++){
            if(address.charAt(i) == '.')    stringBuilder.append("[.]");
            else stringBuilder.append(address.charAt(i));

        }

        return stringBuilder.toString();
    }

    public static void main(String[] args){
        String address = "255.100.50.0";
        test_1108 test = new test_1108();
        test.defangIPaddr(address);
    }
}
