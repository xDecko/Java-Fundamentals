import javax.swing.JOptionPane;

public class Bucles_peso_ideal {
    public static void main(String[] args) {
        
        String genero = "";
        do{
                genero=JOptionPane.showInputDialog("Introduce tu género ( H / M )");

        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);



        //El metodo showInputDialog siempre retorna un string y se debe transformar a int con el metodo parseInt
        int altura=Integer.parseInt(JOptionPane.showInputDialog(" Introduce altura en cm"));

        int peso_ideal=0;

        if (genero.equalsIgnoreCase("H")){

            peso_ideal=altura-100;

        }
        else if (genero.equalsIgnoreCase("M")){

            peso_ideal=altura-110;

        }

        System.out.println("Tu peso ideal es "+ peso_ideal+" KG");
    }
}
