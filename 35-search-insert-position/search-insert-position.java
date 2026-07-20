class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target || nums[i]>target){//num[0]==5->1==5(false),3==5(false),5==5(true)
                return i;//i=2
            }
            else if(i==nums.length-1){//0==3(false),1==3(false),2==3(false),3==3(true)
                return i+1; //3+1=4            
                }
        }
        return -1;
    }
}