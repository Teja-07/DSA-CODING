import java.util.*;
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        Integer diff=(Integer)(target-nums[i]);
        if(hash.containsKey(diff)){
            int[] returnto={nums[i]+1,i+1};
            return returnto;
        }
        hash.put(nums[i],i);
        }
        
        return -1;
    
    }
    
}