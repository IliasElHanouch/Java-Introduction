public class strings {
    public static void main(String args[]) {
        String nombre = "Ilias";
        String texto = "Mi nombre es " + nombre;
        System.out.println(texto);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras; y su primera es: "+ nombre.charAt(0) + "; y la última es: " + nombre.charAt(nombre.length() - 1));
        String subtexto = texto.substring(0,9); //Substring until "Mi nombre"
        System.out.println(texto.length()); //We print the length of the string
        System.out.println(subtexto);
        System.out.println(nombre.equals("ilias")); //Should return False
        System.out.println(nombre.equalsIgnoreCase("ilias")); // Should return True
    
    }
    
}
