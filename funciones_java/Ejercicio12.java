public class Ejercicio12{
    public static void main(String[] args) {
        int numero = 17; 
        boolean esPrimo = esNumeroPrimo(numero);
        
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean esNumeroPrimo(int n) {
        if (n <= 1) {
            return false; 
        }
        
        if (n <= 3) {
            return true; 
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        
        return true; 
    }
}
