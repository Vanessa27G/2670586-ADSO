public class Ejercicio8{

    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("Contenido del arreglo: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int[] miArreglo = {1, 2, 3, 4, 5};

        imprimirArreglo(miArreglo);
    }
}
