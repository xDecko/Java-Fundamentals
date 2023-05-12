public class Matrices_uso {
    public static void main(String[] args) {
        matriz_I(args);
        System.out.println("---------------------------------------------");
        matriz_II(args);
    }



    public static void matriz_I(String[] args) {
        
        int [] matriz_I=new int[5];
        /*   Se puede declarar como en el metodo matriz_II
                     int  matriz[]=new int=[5];         */
        matriz_I[0] = 5;
        matriz_I[1] = 38;
        matriz_I[2] = -15;
        matriz_I[3] = 92;
        matriz_I[4] = 71;

        for (int i=0; i<5; i++){          
            System.out.println("valor de la posicion " + (i+1) + " es " + matriz_I[i]);
        }

    }

    public static void matriz_II(String[] args) {
        
        int [] matriz_II={2,38,-15,92,71,3,5,6,12,64,12};

        for (int i=0; i<matriz_II.length; i++){   
            System.out.println("valor de la posicion " + (i+1) + " es " + matriz_II[i]);
        }

    }
}
