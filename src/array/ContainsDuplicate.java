package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> countList = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!countList.add(nums[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate(new int[]{1,2,3,1}));
    }
}
