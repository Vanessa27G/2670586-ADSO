public class Ejercicio22{

    public static void main(String[] args) {
        int n = 10; 
        int[] numerosPrimos = generarNPrimos(n);

        System.out.println("Los primeros " + n + " números primos son:");
        for (int primo : numerosPrimos) {
            System.out.print(primo + " ");
        }
    }

    public static int[] generarNPrimos(int n) {
        int[] primos = new int[n];
        int encontrado = 0;
        int numero = 2;

        while (encontrado < n) {
            if (esPrimo(numero)) {
                primos[encontrado] = numero;
                encontrado++;
            }
            numero++;
        }

        return primos;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
