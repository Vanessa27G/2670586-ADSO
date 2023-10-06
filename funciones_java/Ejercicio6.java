public class Ejercicio6{

    public static int maximoEntreTres(int num1, int num2, int num3) {
        int maximo = num1; 
        if (num2 > maximo) {
            maximo = num2;
        }

        if (num3 > maximo) {
            maximo = num3;
        }

        return maximo;
    }

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 25;
        int numero3 = 5;

        int maximo = maximoEntreTres(numero1, numero2, numero3);

        System.out.println("El máximo entre " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + maximo);
    }
}
