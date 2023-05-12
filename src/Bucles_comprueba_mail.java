import javax.swing.JOptionPane;

public class Bucles_comprueba_mail {
    public static void main(String[] args) {
        
        int arroba=0;
        boolean punto=false;

        String mail=JOptionPane.showInputDialog("Introduce tu Email");


        for(int i=0; i<mail.length(); i++){

            if (mail.charAt(i)=='@'){
                arroba++;
            }

            if (mail.charAt(i)=='.'){
                punto=true;
            }


        }

        if (arroba==1 && punto==true){
            
            System.out.print("El mail es correcto");

        } else {

            System.out.print("Ingresa un mail valido");
           
        }

        

        
    }
}
