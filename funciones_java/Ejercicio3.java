public class Ejercicio3{

    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 5;
        int resultado = multiplicarNumeros(numero1, numero2);
        System.out.println("El resultado de multiplicar " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    public static int multiplicarNumeros(int numero1, int numero2) {
        int resultado = numero1 * numero2;
        return resultado;
    }
}
