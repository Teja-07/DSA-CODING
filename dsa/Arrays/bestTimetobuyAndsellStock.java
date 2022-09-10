import java.util.*;
public class bestTimetobuyAndsellStock{
    public int stocks(int price[]){
        int buy=price[0],max_profit=0;
        for(int i=1;i<price.length;i++){
            if(buy>price[i]){
                buy=price[i];
            }else if(buy-price[i]>max_profit){
                max_profit=buy-price[i];
            }
        }
        return max_profit;
    }
}