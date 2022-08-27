package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ti15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        int length=nums.length;
        int i,j,k;
        if(length<3){
            return null;
        }

        sort(nums,0,length-1);
        for ( i=0;i<length-2;i++){

            k=length-1;
            j=i+1;
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
           while (j<k){
               if (nums[i]+nums[j]+nums[k]==0){

                       List<Integer> linshi=new ArrayList<Integer>();
                        linshi.add(nums[i]);
                        linshi.add(nums[j]);
                        linshi.add(nums[k]);
                        a.add(linshi);
                   while(j<k  &&nums[k]==nums[k-1]){
                       k=k-1;}
                   while(j<k  &&nums[j]==nums[j+1]){
                       j=j+1;}
                        j++;
                        k--;

               }
               else if (nums[i]+nums[j]+nums[k]>0){

                   k--;
               }
               else if (nums[i]+nums[j]+nums[k]<0){

                   j++;
               }


           }



       }

        return a;
    }
    public static void sort(int[] a, int low, int height) {
        int i = low;
        int j = height;
        if (i > j) {//放在k之前，防止下标越界
            return;
        }
        int k = a[i];

        while (i < j) {
            while (i < j && a[j] > k) { //找出小的数
                j--;
            }
            while (i < j && a[i] <= k) { //找出大的数
                i++;
            }
            if (i < j) {//交换
                int swap = a[i];
                a[i] = a[j];
                a[j] = swap;
            }

        }
        //交换K
        k = a[i];
        a[i] = a[low];
        a[low] = k;

        //对左边进行排序,递归算法
        sort(a, low, i - 1);
        //对右边进行排序
        sort(a, i + 1, height);
    }



}

