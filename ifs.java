import java.util.*;
public class ifs {
    public static void main(String args []){
        Scanner object = new Scanner(System.in);
        System.out.println("Dime tu nota: ");
        double nota = object.nextDouble();
        if (nota < 5) {
            System.out.println("Has suspendido");
        }
        else if (nota < 9) {
            System.out.println("Aprobado");

        }
        else if (nota < 10) {
            System.out.println("Sobresaliente");
        }
        else if (nota == 10) {
            System.out.println("Matrícula de Honor");
        }
        else {
            System.out.println("Nota no válida");
        }  
}
}
    

