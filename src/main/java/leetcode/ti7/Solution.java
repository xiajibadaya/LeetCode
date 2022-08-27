package leetcode.ti7;

public class Solution {
    public int reverse(int x) {
        if(x==0){
            return x;
        }
    String number=String.valueOf(x);
    int len=number.length();
    char arr[]=new char[len];
    int i=0;
    int j=0;
    if (number.charAt(0)=='-'){
        i++;
        arr[0]='-';
        if (number.charAt(1)=='0'){
            i++;
        }
        }
    else {
        if (number.charAt(0)=='0'){
            i++;
        }
    }
    for(;i<len;i++){
        arr[i]=number.charAt(len-1-j);
        j++;
    }
    number= new String(arr);
    long da= Long.parseLong(number);
    if (da>(Math.pow(2, 31)-1)||da<Math.pow(-2,31)){
        return 0;
    }
    int a= (int) da;
    return a;

    }
}
