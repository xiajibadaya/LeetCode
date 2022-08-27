package org.example;

import leetcode.ti15;

import java.util.ArrayList;
import java.util.List;

public class GrammaticalAnalysis {


    public static  void main(String[] args) {
       ti15 soule = new ti15();
       int []a={-2,0,0,2,2};
        List<List<Integer>> b=new ArrayList<List<Integer>>();
       b=soule.threeSum(a);
       for (List<Integer> i:b){
           System.out.println(i);
        }

    }

}
