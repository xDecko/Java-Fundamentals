import java.util.Scanner;

public class Calculos_con_Math {
    public static void main(String[] args) {
        //ejercicio donde busqué que el usuario ingresara los datos con scanner
        Scanner usuario_raiz = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular la raíz: ");
        int numero_raiz = usuario_raiz.nextInt();     
        double raiz = Math.sqrt(numero_raiz);
        int resultado=(int)Math.round(raiz);
        System.out.println("La raiz de  "+numero_raiz+" es " +resultado);

        Scanner usuarioBase = new Scanner(System.in);

        System.out.print("Ingrese un número que quiere elevar a la 3: ");
        double base=usuarioBase.nextDouble();
        double exponente=3;
        int resultado2=(int)Math.pow(base,exponente);
        System.out.println("El resultado de "+(int)base+" elevado a "+(int)exponente+" es "+resultado2);

        usuario_raiz.close();
        usuarioBase.close();
        
    }
    
}
