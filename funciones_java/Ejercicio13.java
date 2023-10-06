
public class Ejercicio13{

    public static void main(String[] args) {
        int[] arreglo = {5, 2, 9, 1, 5, 6};

        ordenarArreglo(arreglo);

        System.out.println("Arreglo ordenado en orden ascendente:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }

    public static void ordenarArreglo(int[] arreglo) {
        Arrays.sort(arreglo);
    }
}
