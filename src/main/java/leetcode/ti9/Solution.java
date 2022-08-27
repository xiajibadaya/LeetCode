package leetcode.ti9;

public class Solution {
    public boolean isPalindrome(int x) {
        String number= String.valueOf(x);
        int len=number.length();
        for (int i=0;i<len;i++){
            if (number.charAt(i)!=number.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
