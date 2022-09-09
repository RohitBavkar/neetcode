package array;

/*https://leetcode.com/problems/product-of-array-except-self/*/
public class ProductArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int prefix = 1, postfix = 1;
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            result[i] = prefix;
            prefix *= nums[i];
        }

        for(int i=nums.length-1; i>=0; i--){
            result[i] *= postfix;
            postfix *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ProductArrayExceptSelf ps = new ProductArrayExceptSelf();
        System.out.println(ps.productExceptSelf(new int[]{1,2,3,4}));
    }
}
