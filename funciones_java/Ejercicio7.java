public class Ejercicio7{

    public static void main(String[] args) {
         public static int[] llenarArregloAleatorio(int[] arreglo, int min, int max) {
        Random rand = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(max - min + 1) + min;
        }

        return arreglo;
    }

    public static void main(String[] args) {
        int[] miArreglo = new int[10]; 
        int valorMinimo = 1; 
        int valorMaximo = 100; 

        miArreglo = llenarArregloAleatorio(miArreglo, valorMinimo, valorMaximo);

        System.out.print("Arreglo lleno de números aleatorios: ");
        for (int i = 0; i < miArreglo.length; i++) {
            System.out.print(miArreglo[i] + " ");
        }
    }
}

    }
 