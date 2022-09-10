import java.util.*;
public class not_repeatednumber {
    public int not_repeatednumber(int nums[]){
        int n=0;
        for(int num=nums){//here we are using or each loop
            nums^=n;//^ means not 
        }
        return n;
    }
}
