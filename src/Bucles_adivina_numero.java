import java.util.*;

public class Bucles_adivina_numero {
    public static void main(String[] args) {
        

        int aleatorio=(int)(Math.random()*100);
        Scanner entrada=new Scanner(System.in);
        int numero=0;

        int intentos=0;

        while(numero!=aleatorio){
            System.out.println("Introduce un numero, por favor");
            numero=entrada.nextInt();
            
            if(aleatorio<numero){
                System.out.println("Más bajo");
            }

            else if(aleatorio>numero) {
                System.out.println("Mas alto");
            }
            intentos++;

            System.out.println("Este es tu intento numero "+ intentos);
        }

        System.out.println("Adivinaste el numero");
        

        entrada.close();
    }
}
