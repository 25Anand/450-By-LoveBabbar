class Solution {
    public boolean containsDuplicate(int[] nums) {
//      Method 1:
//       T C = O(n)
   HashSet set = new HashSet<>();
    for(int n : nums){
    if(!set.add(n)){
        return true;
     }
    }
    return false;
         
    // 2nd solution  
//     TC = O(logN)
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++)
    {
        if(nums[i]==nums[i+1])
            return true;
    }
    return false;
        
     // brutforce 
//      TC=O(n^2)
      for(int i=0;i<nums.length;i++)
     {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
                return true;
        }
     }
    
    return false;
    }
}
