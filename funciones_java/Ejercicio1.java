public class Ejercicio1 {

    public static void main(String[] args) {
        
        int numero1 = 5;
        int numero2 = 7;
        int resultado = sumarNumeros(numero1, numero2);
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    
    public static int sumarNumeros(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }
}
