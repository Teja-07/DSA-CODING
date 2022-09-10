import java.util.*;
//here we need to seperate both odd even element one side .ike 3214 is our array we need to seperate 2431
//so we use temp variable to consider this temp will store all even variables one side and 
//odd variables to the other side
class EvenOddSeparation{
    public int[] evenodd(int nums[]){
        int[] a=new int[nums.length];
    int temp=0;
    for(int i=0;i<nums.length;i++){
        a[temp]=nums[i];
        temp++;
    }
    for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            a[temp]=nums[i];
            temp++;
        }
    }
    return a;
    
}
}