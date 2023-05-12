public class Manipula_cadenas {
    public static void main(String[] args) {
        String nombre="Santo Tomas de Aquino";
        System.out.println("Hola! me llamo "+nombre);
        System.out.println("Mi nombre tiene "+nombre.length()+" caracteres");
        System.out.println("La primera letra de mi nombre es "+ nombre.charAt(0));
        int ultimaLetra;
        ultimaLetra=nombre.length();
        System.out.println("la ultima letra de mi nombre es "+ nombre.charAt(ultimaLetra-1));
    }
    
}
