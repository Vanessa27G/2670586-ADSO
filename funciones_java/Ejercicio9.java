public class Ejercicio9{

    public static int encontrarValorMinimo(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo está vacío o nulo.");
        }

        int minimo = arreglo[0]; 
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }

        return minimo;
    }

    public static void main(String[] args) {
        int[] miArreglo = {5, 2, 8, 1, 6};

        int minimo = encontrarValorMinimo(miArreglo);

        System.out.println("El valor mínimo en el arreglo es: " + minimo);
    }
}
