package leetcode.lileet;

public class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        int start=0;
        int finish=0;
        for (int j=0;j<len;j++)
        {   int y = 1;
            for(;j+y<len;y++){
                if ((j-y+1<0)||(j+y>=len)){
                    break;
                }
                if (  (s.charAt(j - y + 1) == s.charAt(j + y))) {
                    if((j+y)- (j-y+1)>=(finish-start)){
                        start=  j-y+1;
                        finish= j+y;
                    }

                }
                else {
                    break;
                }
            }
        }
        for (int j=1;j<len;j++)
        {   int y = 0;
            for(;j+y<len;y++) {
                if ((j-y<0)||(j+y>=len)){
                    break;
                }
                if ( (s.charAt(j - y ) == s.charAt(j + y))) {
                    if((j+y)- (j-y)>=(finish-start)){
                        start= j-y;
                        finish= j+y;
                    }

                }
                else {
                    break;
                }
            }
        }
        return s.substring(start, finish+1);
    }
}
