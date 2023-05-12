import java.util.*;
import javax.swing.*;

public class RANDOM_0_100{
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        System.out.println(numeroAleatorio);

        if (numeroAleatorio==100){
          System.out.println("YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
          JOptionPane.showMessageDialog(null, "El valor es igual a 100", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }    
}
