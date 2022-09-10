import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public  List<List<Integer>> pascalTriangle(int rows){
        List<List<Integer>> ans=new ArrayList<>();
        if(rows==0)
        return ans;
        List<Integer> intial=new ArrayList<>();
        intial.add(1);
        ans.add(intial);
        for(int i=1;i<rows;i++){
            List<Integer> cur=new ArrayList<>();
            List<Integer> prev=ans.get(i-1);
            for(int j=0;j<i;j++){
                cur.add(prev.get(j-1)+prev(j));
                
            }
            res.add(cur);
        }
        return res;
    }
    
}
