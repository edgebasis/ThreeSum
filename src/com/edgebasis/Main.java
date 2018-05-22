package com.edgebasis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{-1,0,1,2, -1,-4};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int count =0;

        Arrays.sort(nums);

        for(int i=0; i<nums.length-2;i++) {
            count = nums[i];
            //List<Integer> nums3 = new ArrayList<>();

            if(i==0 || nums[i] > nums[i-1]) {
                int start=i+1;
                int end = nums.length-1;

                while(start<end) {
                    if ((nums[start] + nums[end] + count) == 0) {
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        arrayList.add(nums[start]);
                        arrayList.add(nums[end]);
                        arrayList.add(count);
                        result.add(arrayList);

                    }
                    if ((nums[start] + nums[end] + count) < 0) {
                        int currentStart = start;
                        while(nums[start] == nums[currentStart] && start < end) {
                            start++;
                        }
                    }else {
                        int currentEnd = end;
                        while(nums[end] == nums[currentEnd] && start < end){
                            end--;
                        }
                    }

                }


            }



        }

        System.out.println(result);
    }
}
