public class funciones1 {
    public static int multiplicacion(int x,int y) {
        return x * y;
    }
    public static boolean esMultiploDe5(int num){
        return (num % 5 == 0);
    }
    public static boolean isSorted(int[] lista){
        //Algorithm to check whether an array is sorted or not
        for (int i = 1;i < lista.length;i++){
            if (lista[i] < lista[i-1]){
                return false;
            }
        }
        return true;}
    public static boolean isPalindrome(String word){
        for(int i=0;i< word.length();i++){
            if (word.charAt(i) != word.charAt((word.length()-1)-i)){
                return false;
            } 
        }
        return true;
    }

    public static void main(String args []){
        System.out.println(multiplicacion(2,3));
        System.out.println(esMultiploDe5(30));
        int[] lista1 = {1,2,4,1};
        System.out.println(isSorted(lista1));
        System.out.println(isPalindrome("rodar"));
    }
    
}
