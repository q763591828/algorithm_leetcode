package Offer;

public class Offer_37 {
    int[] array;

    public int findleft(int b,int e,int k ){
        int mid = (b+e) >> 1;

        if(array[mid] == k){
            if(mid == 0 || array[mid-1] != k) // 说明找到了左边的边界
                return mid;
            else
                return findleft(b,mid,k);
        }else{
            if(b == e-1)
                return e;
            return findleft(mid,e,k);
        }
    }

    public int findright(int b,int e,int k ){
        int mid = (b+e) >> 1;
        if(b == e)
            return b;
        if(array[mid] == k){
            if(mid == array.length-1 || array[mid+1] != k) // 说明找到了左边的边界
                return mid;
            else
                return findright(mid,e,k);
        }else{
            return findright(b,mid,k);
        }
    }

/*
    public int find(int b , int e , int k){

        int mid = (b+e) >> 1;
        if( array[mid] == k) {
            find(b, mid, k);
            find(mid + 1, e, k);

        }else if( array[mid] < k){
            find(b,e,k);


        }else{

        }

        return 0;
    }*/

    public int[] findK(int b,int e ,int k ){
        int[] result = {0,0,0};
        if(b == e) {
            result[0] = b;result[1] = e;result[2]=-1;
            return result;
        }
        int mid = (b+e) >> 1;
        if(array[mid] == k){

            result[0] = b;result[1] = e;result[2]=k;
            return result;
        }else if(array[mid] < k){
            b = mid+1;
            return findK(b,e,k);
        }else {
            e = mid;
            return findK(b,e,k);
        }
    }


    public int GetNumberOfK(int [] array , int k) {
        this.array =array;
        int[] t = findK(0,array.length,k);
        int mid = (t[0] + t[1]) >> 1;
        if(t[2] == -1)
            return 0;
        int l = findleft(t[0],mid,k);
        int r = findright(mid,t[1],k);
        int result = r -l+1;
        return result;
    }

    public static void main(String[] args){
        Offer_37 offer_37 = new Offer_37();
        int[] array = {};
        offer_37.GetNumberOfK(array,0);
    }
}
