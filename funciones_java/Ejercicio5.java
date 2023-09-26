public class Ejercicio5{

    public static void main(String[] args) {
        int base = 2.0;
        int exponente = 3;
        int resultado = calcularPotencia(base, exponente);
        System.out.println(base + " elevado a la potencia " + exponente + " es igual a: " + resultado);
    }

    public static int calcularPotencia(int base, int exponente) {
        int resultado = 1.0;

        if (exponente == 0) {
            return 1.0;
        }

        for (int i = 1; i <= Math.abs(exponente); i++) {
            resultado *= base;
        }

        if (exponente < 0) {
            resultado = 1.0 / resultado;
        }

        return resultado;
    }
}
