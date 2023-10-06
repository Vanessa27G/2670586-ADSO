public class Ejercicio4{

    public static void main(String[] args) {
        int numero1 = 7;
        int numero2 = 3;
        int resultado = dividirNumeros(numero1, numero2);
        System.out.println("El resultado de dividir " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    public static int dividirNumeros(int numero1, int numero2) {
        int resultado = numero1 / numero2;
        return resultado;
    }
}
