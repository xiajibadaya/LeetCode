package leetcode.Zzixingbianhuan;

import java.util.Arrays;

public class Solution {
    public String convert(String s, int numRows) {
        int len=s.length();
        char [][] arr=new char[len][numRows];
        for(int j=0;j<numRows;j++){
            for (int i=0;i<len;i++){
                arr[i][j]='/';
            }
        }
        int lun;
        int yushu;
        if (numRows==1) return s;
        for(int i=0;i<len;i++){
            lun=i/(2*numRows-2);
             yushu=i%(2*numRows-2);
            if(yushu<numRows)
                    {
                        arr[lun*(numRows-1)][yushu]=s.charAt(i);

                    }
                    else
                    {
                        arr[lun*(numRows-1)+yushu-numRows+1][numRows-(yushu-numRows)-2]=s.charAt(i);

                    }
        }
        char[] arrayOfchar=new char[len];
        int zhizhen=0;
        for(int j=0;j<numRows;j++){
            for (int i=0;i<len;i++){
                if (arr[i][j]!='/'){

                    arrayOfchar[zhizhen]=arr[i][j];
                    zhizhen++;
                }
            }
        }
        String arrayToString =  new String(arrayOfchar);
        return arrayToString;
    }
}
