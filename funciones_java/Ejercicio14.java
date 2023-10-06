public class Ejercicio14{

    public static void main(String[] args) {
        int[] arregloAscendente = {1, 2, 3, 4, 5};
        int[] arregloDesordenado = {3, 1, 4, 2, 5};

        boolean esAscendente1 = estaOrdenadoAscendente(arregloAscendente);
        boolean esAscendente2 = estaOrdenadoAscendente(arregloDesordenado);

        System.out.println("El primer arreglo está ordenado de forma ascendente: " + esAscendente1);
        System.out.println("El segundo arreglo está ordenado de forma ascendente: " + esAscendente2);
    }

    public static boolean estaOrdenadoAscendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
