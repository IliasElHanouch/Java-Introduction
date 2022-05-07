import java.util.Arrays;
//Auxiliary function to get the slice of an array
public class slicing {
    public static int[] getSlice(int[] array,int start, int end){
        int [] lista = new int[end-start]; //Creo una array con end-start elementos iniciados a 0
        for(int i=0;i < lista.length;i++){
            lista[i] = array[start+i];
        }
        return lista;  
    }
    //Example of isSorted using recursion
    public static boolean isSortedR(int[] array){
        if (array == null){
            return false;
        }
        if (array.length <= 1){
            return true;
        }
        return array[0] <= array[1] && isSortedR(getSlice(array, 1, array.length));
    }
    public static int sumArray(int[] array){
        /* Recursive function that returns the summatory of all the elements that belong to an array */
        if (array == null){
            return 0;
        }
        if (array.length == 0){
            return 0;
        }
        return array[0] + sumArray(getSlice(array, 1, array.length)); 
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(getSlice(arr,1,3)));
        System.out.println(isSortedR(arr));
        System.out.println(sumArray(arr));
    }
}
