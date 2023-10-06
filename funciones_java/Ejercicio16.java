public class Ejercicio16{

    public static void main(String[] args) {
        int numero = 12345; 
        int cantidadDigitos = contarDigitos(numero);
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
    }

    public static int contarDigitos(int numero) {
        String numeroComoCadena = Integer.toString(numero);
        return numeroComoCadena.length();
    }
}
