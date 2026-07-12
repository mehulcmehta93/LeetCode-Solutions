class Solution {
    public int[] twoSum(int[] nums, int target) {        
        for (int i=0; i < nums.length; i++){
            for (int j=1; j < nums.length; j++){
                if (i !=j ) {
                    if (nums[i]+ nums[j] == target ){
                        System.out.println("match found target " + target); 
                        System.out.println("match found i " + nums[i]); 
                        System.out.println("match found j " + nums[j]);                    
                        return new int[] { i,j };
                    }
                }
            }
        }
        return null;
    }
}