import java.util.*;
class numberofisland{
public int numberofisland(char[][] lands){
    int count=0;
    for(int i=0;i<lands.length;i++){
        for(int j=0;j<lands[i].length;j++){
            if(lands[i][j]=='1'){
                count++;
                bfsofislands(lands,i,j);
            }
        }
    }
    return count;

}
public void bfsofislands(char[][] lands,int i,int j){
    if(i<0||i>=lands.length ||j<0||j>=lands.length||lands[i][j]=='0'){
        return;
    }
    lands[i][j]='0';
    bfsofislands(lands, i+1, j);//up
    bfsofislands(lands, i-1, j);//down
    bfsofislands(lands, i, j+1);//right
    bfsofislands(lands, i, j-1);//left
}
}