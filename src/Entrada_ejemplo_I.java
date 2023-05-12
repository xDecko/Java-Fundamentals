import java.util.*;

public class Entrada_ejemplo_I {
    public static void main(String[] args) {

        //solo es necesario crear un objeto Scanner el cual se puede usar despues para leer datos de la consola 
        Scanner entrada= new Scanner(System.in);
        System.out.println(" Intruduce tu nombre, por favor");

        String nombre_usuario= entrada.nextLine();

        System.out.println("Intruduce tu edad, por favor");

        int edad = entrada.nextInt();

        System.out.println("Hola "+nombre_usuario+"! El año que viene tendras "+(edad+1)+" años");
        entrada.close();
    }
}
