import javax.swing.*;

public class Bucles_factorial {
    
    public static void main(String[] args) {

        // Declaramos resultado como long porque el factorial de 20 ya supera lo la capacidad de int
        Long resultado=1L;

        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

        for(int i=numero; i>0;i--){
            resultado=resultado*i;

        }

        System.out.println("El factorial de "+ numero + " es " + resultado);
    }
}
