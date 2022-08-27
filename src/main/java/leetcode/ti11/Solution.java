package leetcode.ti11;

public class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int x=0;
        int y=len-1;
        int max=0;
        while(x!=y){
            if (height[x]>=height[y]){
                if((y-x)*height[y]>=max){
                    max=(y-x)*height[y];

                }

                y--;
            }
            else {
                if((y-x)*height[x]>=max){
                    max=(y-x)*height[x];

                }
                x++;
            }

        }
        return max;
    }
}
