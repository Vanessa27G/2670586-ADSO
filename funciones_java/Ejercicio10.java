public class Ejercicio10{

    public static double calcularPromedio(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo está vacío o nulo.");
        }

        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        double promedio = (double) suma / arreglo.length;

        return promedio;
    }

    public static void main(String[] args) {
        int[] miArreglo = {5, 2, 8, 1, 6};

        double promedio = calcularPromedio(miArreglo);

        System.out.println("El promedio del arreglo es: " + promedio);
    }
}
