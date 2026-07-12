class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set <Integer> test = new HashSet<>();

        for (int num : nums) {
            if (test.contains(num)){
                return true;
            }
            test.add(num);
        }
            return false;
    }

}