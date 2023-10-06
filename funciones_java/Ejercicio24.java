public class Ejercicio24{

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 

        int[] resultado = contarParesEImpares(arreglo);
        int pares = resultado[0];
        int impares = resultado[1];

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }

    public static int[] contarParesEImpares(int[] arreglo) {
        int pares = 0;
        int impares = 0;

        for (int numero : arreglo) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        int[] resultado = {pares, impares};
        return resultado;
    }
}
