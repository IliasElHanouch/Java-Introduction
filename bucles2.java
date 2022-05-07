public class bucles2 {
    public static void main(String args[]){
        //Parámetro 1: donde inicia el bucle
        //Parámetro 2: hasta donde llega
        //Parámetro 3: como va incrementando cada operación
        for (int i= 0;i < 5;i+=1){
            System.out.print(i + " ");
        }

        /*Cómo "corregir" un break dentro de un for:
        Como no predecimos cuantas veces se va a repetir
        pues lo que vamos a hacer es un while*/
        boolean encontrado;
        encontrado = false;
        String txt = "Hola qué tal";
        int count = 0;
        while (count < (txt.length()-1) && encontrado !=true){
            if (txt.charAt(count) == 'k'){ //Nota: el string con el que comparo va sólo en comilla simple
                encontrado = true;
            }
            else{count +=1;}
            
        }
        if (encontrado == true){
        System.out.println("\n" + count);}
        else{
            System.out.println("\nNo encontrado");
        }
    }
}
