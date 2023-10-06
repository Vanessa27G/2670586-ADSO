public class Ejercicio18{

    public static void main(String[] args) {
        int numero = 12345; 
        int numeroInvertido = invertirNumero(numero);
        System.out.println("El número invertido de " + numero + " es " + numeroInvertido);
    }

    public static int invertirNumero(int numero) {
        String numeroComoCadena = Integer.toString(numero);
        
        String cadenaInvertida = new StringBuilder(numeroComoCadena).reverse().toString();
        
        int numeroInvertido = Integer.parseInt(cadenaInvertida);
        
        return numeroInvertido;
    }
}
