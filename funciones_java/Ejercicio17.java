public class Ejercicio17{

    public static void main(String[] args) {
        int numero = 12345; 
        int suma = sumarDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es " + suma);
    }

    public static int sumarDigitos(int numero) {
        int suma = 0;

        while (numero != 0) {
            int digito = numero % 10; 
            suma += digito; 
            numero /= 10; 
        }

        return suma;
    }
}
