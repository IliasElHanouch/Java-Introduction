public class funciones_prueba {
    public static int getMax(int[] lista){
        int max = lista[0];
        for (int i= 0;i< lista.length;i++){
            if (lista[i] > max){
                max = lista[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int[] arr = {4,2,1,5,9,-8,27,22,-3,4};
        System.out.println(getMax(arr));
    }
}
