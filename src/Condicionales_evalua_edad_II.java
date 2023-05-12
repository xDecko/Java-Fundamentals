import java.util.*;

public class Condicionales_evalua_edad_II {
     public static void main(String[] args) {
           

        //Se crea un scanner para poder recibir el dato del usuario 
       
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tu edad, por favor");

        // se crea la variable edad y se le asigna el objeto Scanner que creamos 
        int edad=entrada.nextInt();

        if (edad<18) {

            System.out.println("Eres un adolescente");
            
        } else if (edad<40) {

            System.out.println("Eres joven"); 
 
        } else if (edad<65) {

            System.out.println("Eres maduro");

        } else {
            
            System.out.print("Cuidate");
        }


        entrada.close();

    }


}
