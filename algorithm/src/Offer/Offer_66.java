package Offer;

public class Offer_66 {

    int threshold;
    int rows;
    int cols;
    int sum;
    int sign[][];
    public void find(int i , int j){
        if(sign[i][j] != 0)
            return;
        int tmp = 0,t_r = i , t_c = j;

        while ( t_r!= 0){
            tmp+=t_r%10;
            t_r = t_r/10;
        }
        while ( t_c!= 0){
            tmp+=t_c%10;
            t_c = t_c/10;
        }

        sign[i][j] = 1;

        if(tmp > threshold)
            return;

        sum++;
        if(i > 0 ){ //行上移动
            find(i-1,j);
        }
        if(i < rows-1){ //行下移动
            find(i+1,j);
        }
        if(j > 0){  //列左移动
            find(i,j-1);
        }
        if(j < cols - 1){   //列右移动
            find(i,j+1);
        }
    }



    public int movingCount(int threshold, int rows, int cols) {
        this.threshold = threshold;
        this.rows = rows;
        this.cols = cols;
        sign = new int[rows][cols];

        find(0,0);
        /*for(int i = 0 ;i < rows ; i++){
            for(int j = 0 ; j <cols ; j++){
                find(i,j);
            }
        }*/
        return sum;
    }


    public static void main(String[] args){
        Offer_66 offer_66 = new Offer_66();
        offer_66.movingCount(1,10,10);
    }
}
