import java.util.*;
public class bucles {
    public static void main(String args[]){
        Scanner object = new Scanner(System.in);
        boolean correct = false;
        int numero;
        //A diferencia de Python; el primer input se produce fuera del bucle
        System.out.println("Introduce un número positivo");
        numero = object.nextInt();
        while (correct != true) {
          System.out.println("Introduce un número positivo");
          numero = object.nextInt();
          if (numero >= 0) {
                correct = true;
          }  
        }
      System.out.println(numero);

    }
    
}
