public class Solution{
    public int[] twoSum(int[] num, int target){
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                int res=num[i]+num[j];
                if(res==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}