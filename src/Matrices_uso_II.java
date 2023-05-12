
public class Matrices_uso_II {
    public static void main(String[] args) {

        int [] matriz_aleatorios=new int[150];


        //Creacion de matriz con numeros aleatorios usando metodos math
        for (int i=0; i<matriz_aleatorios.length;i++){

                matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
        }


        // Nueva manera de imprimir la matriz con la actualizacion de java, antes tocaba recorrerla 
        for (int numeros:matriz_aleatorios){

            System.out.print(numeros + " ");
        }

    }
}

     

