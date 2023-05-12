public class EJERCICIO_ARRAY_2D { //ejercicio que calcula el rendimiento de 10000 usd con 6 porcentajes diferentes(10%,11%,12%,13%,14%,15%) a traves de 5 años 

                        //El resultado tiene 6 columnas donde se inicia en todas con 10000 y 5 filas donde se ve como progresa el interes a travez de cada año
    public static void main(String[] args) {

        double acumulado;
        double interes=0.10;

        double [][] saldo=new double[6][5];

        for (int i=0; i<6;i++){
            

            saldo[i][0]=10000; //con esta linea le asignamos a la primera linea de todas las columnas del array el valor 10000 con la variable i 
            acumulado=10000;

            for(int j=1;j<5;j++){ //inicializa (j=1) porque la posicion [0][0] tiene el valor inicial que es 10000,y se busca que en [0][1] se coloque 10000+10% de interes

                acumulado=acumulado+(acumulado*interes); //ke asigna a (acumulado) el rendimiento del año que se va a ubicar en la siguiente fila
                saldo[i][j]=acumulado; //se le asigna a la fila el valor de acumulado
            }

            interes=interes+0.01; //se le suma 0,01 a interes para que la la siguiente columna tenga el rendimiento mayor (10%,11%,12%,13%,14%,15%)
        }


         /*    for(int z=0;z<6;z++){

                System.out.println();

                for(int h=0;h<5;h++){
                    System.out.printf("%1.2f",saldo[z][h]);
                    System.out.println(" ");
                }

            }   */

            //manera de imprimirlo usando un for each
                for(double[]fila:saldo){   
                                
                    System.out.println();

                for(double columna: fila){      
                        
                        System.out.printf("%1.2f",columna);
                        System.out.println(" ");             
                    }                      
                }


    }

}
