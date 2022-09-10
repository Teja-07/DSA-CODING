public class reverseString {
    public void reverseString(){
    char[] s={"h","e","l","l","o"};
    int left=0;
    int end=s.length-1;
    while(left<end){
        char temp=s[left];
        s[left]=s[end];
        s[end]=temp;
        end--;
        left++;
    }
    }
}
 //there is one more method we can reverse the string by using for loop
//  for(int i=s.length-1;i>=0;i--){
//     println(s[i]);
//  }