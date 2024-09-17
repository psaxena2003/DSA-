class Solution {
    public boolean canJump(int[] nums) {
        int finalPosition = nums.length-1;
        for(int i = nums.length-2; i>=0; i--){
            if(i + nums[i]>=finalPosition){
                finalPosition = i;
            }
        }
        if(finalPosition==0){
            return true;
        }
        else{
            return false;
        
        }
    }
}