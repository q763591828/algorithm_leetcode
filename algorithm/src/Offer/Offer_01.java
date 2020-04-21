package Offer;

public class Offer_01 {
    public static boolean Find(int target, int [][] array) {

        int row = array.length -1 ; //行
        int column = array[0].length -1 ;//列

        if( row == 0 && column == -1)
            return  false;
        //System.out.println(row);
        //System.out.println(column);

        int i_begin=0,j_begin=0,i_end=row,j_end=column;
        /*while (array[i_begin][j_begin] < target && target < array[i_end][j_begin]){
            int i_tmp = (i_begin + i_end)/2;
            if( array[i_tmp][j_begin] > target){
                i_end = i_tmp;
            }else{
                i_begin = i_tmp;
            }

            if(array[i_begin][j_begin] == target){
                return true;
            }

            //表示已经找到了i_begin的确定位置，这一行中一定有所找的值，否则就是没有
            if(i_begin + 1 == i_end){
                break;
            }
        }

        if( array[i_end][j_begin] < target){
            i_begin= row;
        }*/



        for( i_begin = 0 ; i_begin <= row ; i_begin ++){
            while(array[i_begin][j_begin] <= target &&  target <= array[i_begin][j_end]){
                int j_tmp = (j_begin + j_end)/2;
                if(array[i_begin][j_tmp] == target){
                    return true;
                }

                if( array[i_begin][j_tmp] > target){
                    j_end = j_tmp;
                }else{
                    j_begin = j_tmp;
                }



                if(j_begin + 1 == j_end){

                    if(array[i_begin][j_begin] == target || array[i_begin][j_end] == target){
                        return true;
                    }else {
                        j_begin = 0;
                        j_end = column;
                        break;
                    }
                }
            }
        }


        return  false;

    }


    public static void main(String[] args){
        int[][] a =new int[][]{{}};

        /*int sum = 1;
        for(int i = 0 ; i < 4 ; i++){+
            for( int j = 0 ; j < 4 ; j++){
                a[i][j] = sum;
                sum++;
            }
        }*/
        Find(1,a);

    }
}
