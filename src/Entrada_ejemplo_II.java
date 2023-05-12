import javax.swing.*;

public class Entrada_ejemplo_II {
    public static void main(String[] args) {
        String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
        String edad=JOptionPane.showInputDialog("Intruduce tu edad, por favor");
        int edad_usuario=Integer.parseInt(edad); 
        edad_usuario++;
        System.out.println("Hola "+nombre_usuario+" El proximo a;o tendras "+edad_usuario+" a;os");
    }
}
