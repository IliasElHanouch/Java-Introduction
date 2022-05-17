import java.util.Arrays;
public class quicksort {
    private static void  _qsort (int[]data,int start,int end){
        int i = start;
        int j = end;
        int m = Math.floorDiv((start+end), 2);
        int p = data[m];
        while (i <= j){
            while (data[i] < p){
                i++;
            }
            while (data[j] > p){
                j--;
            }
            if (i<=j){
                int temp = data[j];
                data[j] = data[i];
                data[i] = temp;
                i++;
                j--;
            }
        }
    if (start < j){
        _qsort(data,start,j);
    }
    if(i<end){
        _qsort(data,i,end);
    }
    }
    public static  void qsort(int[]data){

        if (data.length<=1){
            ;
        }
        else{_qsort(data,0,data.length-1);}
        
    }
    public static void main(String args[]){
        int[] d = {4,2,-1,0,2,-3,8,1};
        System.out.println(Arrays.toString(d));
        qsort(d);
        System.out.println(Arrays.toString(d));
    }
}
