//Ejercicio Areas de Cuadrado, Rectangulo, Triangulo y Circulo
import java.util.*;
import javax.swing.*;

public class EJERCICIO_AREAS {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in); // Scanner no es estatico por lo cual se debe crear un objeto 

        System.out.println("Elige una opcion para hallar el area:\n 1: Cuadrado \n 2: Rectangulo \n 3: Triangulo \n 4: Circulo ");
        
        int figura=entrada.nextInt();

        switch (figura) {

            case 1:

                /* RECORDAR cuando los METODOS son o NO son estaticos
                    - En este caso showInputDialog es estatico y no requiere creación de objeto como Scanner
                    - Como el metodo showInputDialog regresa un String se debe usar parseInt para pasarlo a Int       */

                int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado"))    ;

                System.out.println(" El area del cuadrado es "+ Math.pow(lado,2));

                break;

            case 2:


                int base_rectangulo=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectangulo"));
                int altura_rectangulo=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del rectangulo"));

                System.out.println("El area del rectangulo es "+ base_rectangulo*altura_rectangulo);

                break;

            case 3: 

                double base_triangulo=Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triangulo"));
                double altura_triangulo=Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triangulo"));

                System.out.println("El area del triangulo es "+ (base_triangulo*altura_triangulo)/2);

                break;

            case 4: 

                int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));
                
                System.out.print("El area del circulo es ");

                System.out.printf("%1.2f",Math.PI*(Math.pow(radio,2)));

                break;
            
            default:
                
                System.out.println("La opción no es correcta");

        }

        entrada.close();
    }
}


