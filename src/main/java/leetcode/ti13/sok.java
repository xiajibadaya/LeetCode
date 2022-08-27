package leetcode.ti13;

public class sok {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        int min=100;
        char a;
        for (int i=0;i<len;i++){
            if(strs[i].length()<=min){
                min=strs[i].length();
            }
        }
        for (int i=0;i<min;i++){
             a=strs[0].charAt(i);
            for(int j=0;j<len;j++){

                if(strs[j].charAt(i)!=a){
                    if (j==0){
                        return "";
                    }
                    else {
                        return strs[0].substring(0,i);
                    }
                }
            }
        }

        return  strs[0].substring(0,min);
    }
}
