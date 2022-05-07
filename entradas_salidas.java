import java.util.*; //Importamos clase Scanner para "leer información"
import javax.swing.*;
public class entradas_salidas {
    public static void main(String args[]){
        Scanner object = new Scanner(System.in); //Tomamos como referencia System e "in" para poder introducir
        System.out.println("Introduce tu nombre:");
        //No obstante, esto lo "debe leer" el programa, entonces usamos la utilidad definida
        String nombre = object.nextLine();
        System.out.println("Tu nombre es: " + nombre);

        System.out.println("Introduce tu edad");
        int edad = object.nextInt();
        System.out.println("Tu edad es: "+edad);
        //Una forma mucho más elegante de introducir datos en una ventana emergente
        String apellido = JOptionPane.showInputDialog("Apellido: ");
        System.out.println(apellido);
    }
    
}
