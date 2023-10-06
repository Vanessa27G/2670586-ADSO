public class Ejercicio2{

    public static void main(String[] args) {
        int numero1 = 15;
        int numero2 = 3;
        int resultado = restarNumeros(numero1, numero2);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    public static int restarNumeros(int numero1, int numero2) {
        int resultado = numero1 - numero2;
        return resultado;
    }
}
