package leetcode.ti8;

public class Solution {
    public int myAtoi(String s) {
        int len=s.length();
        if (len==1&&(s.charAt(0)=='-'||s.charAt(0)=='+')){
            return 0;
        }
        int hasnumber=0;
        int isfushu=0;
        int j=0;
        int start=0;
        int finish=0;
      for (int i=0;i<len;i++){
          if (s.charAt(i)!=' '){
              break;
          }
          else{
              j++;
          }
          }
      for (;j<len;j++){
          if (s.charAt(j)=='-')
          {
              isfushu++;
              j++;
              if((48<=s.charAt(j))&&(s.charAt(j)<=57)){

              }
              else{
                  return 0;
              }
          }
          if (s.charAt(j)=='+')
          {

              j++;
              if((48<=s.charAt(j))&&(s.charAt(j)<=57)){

              }
              else{
                  return 0;
              }
          }
          if((48<=s.charAt(j))&&(s.charAt(j)<=57)){

              start=j;
              hasnumber++;
              for (int k=j;k<len;k++){
               if ((48<=s.charAt(k))&&(s.charAt(k)<=57)){
                   finish=k;
               }
               else{
                   break;
               }
              }
              break;
          }
          else {return 0;}
      }
      if (finish-start==0&&hasnumber==0)
      {
          return 0;
      }
      String su=s.substring(start,finish+1);
      long fa= Long.parseLong(su);
      if (isfushu==1){
          fa=-fa;
      }
        if (fa>(Math.pow(2, 31)-1))
        {
            return (int)(Math.pow(2, 31)-1);

        }
        if (fa<Math.pow(-2,31))
        {
            return (int)Math.pow(-2,31);

        }
     return (int)fa;
    }
}
