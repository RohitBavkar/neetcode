package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mapCount = new HashMap<>();
        List<Integer>[] arrayBucket = new ArrayList[nums.length];
        int[] result = new int[k];

        for(int n : nums){
            if(mapCount.containsKey(n))
                mapCount.put(n, mapCount.get(n)+1);
            else
                mapCount.put(n, 1);
        }

        for(Map.Entry m : mapCount.entrySet()){
            arrayBucket[(int)m.getValue()].add((int)m.getKey());
        }

        for(int j=0; j<=k; j++) {
            for(int i=arrayBucket.length; i>=0; i--){
                if(!arrayBucket[i].isEmpty()){

                }
            }
        }



        return nums;
    }
    public static void main(String[] args) {
        TopKFrequentElements tp = new TopKFrequentElements();
        System.out.println(tp.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }
}
