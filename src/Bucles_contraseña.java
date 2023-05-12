import javax.swing.*;

public class Bucles_contraseña {
    public static void main(String[] args) {
        
        String clave="Decko";
        String pass="";

        while (clave.equals(pass)==false) {

            pass=JOptionPane.showInputDialog("Intruduce la contraseña, por favor");

            if (clave.equals(pass)==false) {
                    System.out.println(" Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta, acceso permitido.");
    }
}
