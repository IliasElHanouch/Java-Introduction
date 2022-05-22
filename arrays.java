public class arrays {
    public static void main(String args[]){
        String[] coches = {"Volvo","Ford","Mazda","Mercedes-Benz"};
        int count = 0;
        for (int i=0;i<coches.length;i++){
            if (coches[i] == "Ford"){
                break;    
            }
            count ++;
        }
        System.out.println(count);

        //Algoritmo para sacar el máx de una lista
        int[] lista = {23,1,4,-4,2,7,101,32,44,98};
        int max = lista[0];
        //Especie de 'for i in lista'
        for(int i: lista){
            if (i > max){
                max = i;
            }
        }
        //Algoritmo para sacar el mínimo
        int min = lista[0];
        for(int i = 0;i<lista.length;i++){
            if (lista[i] < min){
                min = lista[i];
            }
        }
        System.out.println("El máximo es: " + max + " y el mínimo es: " + min);
    }
}
