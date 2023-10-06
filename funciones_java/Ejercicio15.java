public class Ejercicio15{

    public static void main(String[] args) {
        int n = 10; 
        int resultado = calcularFibonacciIterativo(n);
        System.out.println("El " + n + "º término de Fibonacci es: " + resultado);
    }

    public static int calcularFibonacciIterativo(int n) {
        if (n <= 1) {
            return n;
        } else {
            int fibNMinus1 = 1;
            int fibNMinus2 = 0;
            int fib = 0;

            for (int i = 2; i <= n; i++) {
                fib = fibNMinus1 + fibNMinus2;
                fibNMinus2 = fibNMinus1;
                fibNMinus1 = fib;
            }

            return fib;
        }
    }
}
