import java.util.*;

public class Bucles_For {
    public static void main(String[] args) {

        //Se crea el objeto scanner el cual se usa para leer la consola en nombre y veces
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Intruduce tu nombre");
        String nombre = scanner.nextLine();
        
        System.out.println(" Intruduce el numero de veces");
        int veces = scanner.nextInt();
        

        /* El for mas basico es i=0;i<10,i++  
        le agregué que el usuario pudiera ingresar las veces que se imprimia el nombre */

        for(int i=0;i<veces;i++){ 
            
            System.out.println(nombre);

        }

        scanner.close();

    }
}
