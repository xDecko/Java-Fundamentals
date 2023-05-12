public class MATRICES_FOR_EACH{
    public static void main(String[] args) {

        // manera de llenar un array más sencilla
        int [][] matriz={
            {10,15,18,19,21},
            {5,25,37,41,15},
            {7,19,32,14,90},
            {85,2,7,40,27},

        };


        //imprimir el array con un for each, lo que lo hace mas sencillo de escribir pero es mas duro de entender

        for(int[]fila:matriz){  //en esta linea la nueva variable (fila) del loop "for each" va a recorrer (matriz) [son 4 elementos { }]
            System.out.println();
            for(int columna: fila){ //con este for (columna) recorre cada posicion (fila) [son 5 elementos]
                System.out.print(columna+ " ");               
            }//al salir de este for entra de nuevo al primer for y sigue leyendo el siguiente { } del array
        }

        //para entenderlo, el primer for recorre los cuatro { } y el segundo for recorre todas las posiciones donde estan los numeros a,b,c,d,e
    }
}//Recordar que pueden hacerce arrays con muchas mas dimensiones por lo cual hay que comprender como funciona el FOR EACH y como recorrr arrays
