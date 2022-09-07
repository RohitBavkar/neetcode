package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
  https://leetcode.com/problems/two-sum/
*/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int difference;
        for(int i = 0; i < nums.length; i++){
            difference = target - nums[i];

            if(map.containsKey(difference)){
                return new int[] {map.get(difference), i};
            }

            map.put(nums[i], i);
        }

        return nums;

    }

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        System.out.println(Arrays.toString(t.twoSum(new int[]{2,7,11,15}, 9)));
    }

}
