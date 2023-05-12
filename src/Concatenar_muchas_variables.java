public class Concatenar_muchas_variables {


    public static void main(String[] args) {
        //ejemplo1(args);
        ejemplo3(args);
    }

    public static void ejemplo1(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7, h = 8, i = 9, j = 10, k = 11, l = 12, m = 13, n = 14, o = 15, p = 16, q = 17, r = 18, s = 19, t = 20;

        String resultado = String.format("%d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d", a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);

        System.out.println(resultado);
    }

    public static void ejemplo2(String[] args) {
        int a = 3, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7, h = 8, i = 9, j = 10, k = 11, l = 12, m = 13, n = 14, o = 15, p = 16, q = 17, r = 18, s = 19, t = 30;

        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ").append(e).append(" ")
        .append(f).append(" ").append(g).append(" ").append(h).append(" ").append(i).append(" ").append(j).append(" ")
        .append(k).append(" ").append(l).append(" ").append(m).append(" ").append(n).append(" ").append(o).append(" ")
        .append(p).append(" ").append(q).append(" ").append(r).append(" ").append(s).append(" ").append(t);

        System.out.println(sb.toString());
    }


    public static void ejemplo3(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7, h = 8, i = 9, j = 10, k = 11, l = 12, m = 13, n = 14, o = 15, p = 16, q = 17, r = 18, s = 19, t = 20;

        int [] matriz_numeros={a,b,c,d,e,f,g,h,i,j,k,l,n,m,o,p,q,r,s,t};
        
        int contador = 1;
        for (int numeros:matriz_numeros){
            System.out.println("posicion " + contador + " Numero " + numeros);
            contador++;
        }
    }



}
