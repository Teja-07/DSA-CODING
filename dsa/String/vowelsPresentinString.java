package String;
//here v represent the vowels present in the string s
public class vowelsPresentinString {
    public int numJewelsInStones(String v, String s){
        int num=0;
        for(int i=0;i<s.length();i++){
            if(v.indexOf(s.charAt(i))){
                num++;
            }
        }
        return num;
    }
}
