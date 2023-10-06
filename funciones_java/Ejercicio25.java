
public class Ejercicio25{

    public static void main(String[] args) {
        int limiteInferior = 1; 
        int limiteSuperior = 100; 

        int numeroAleatorio = generarNumeroAleatorio(limiteInferior, limiteSuperior);
        System.out.println("Número aleatorio dentro del rango [" + limiteInferior + ", " + limiteSuperior + "]: " + numeroAleatorio);
    }

    public static int generarNumeroAleatorio(int limiteInferior, int limiteSuperior) {
        if (limiteInferior >= limiteSuperior) {
            throw new IllegalArgumentException("El límite inferior debe ser menor que el límite superior.");
        }

        Random random = new Random();
        int numeroAleatorio = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
        return numeroAleatorio;
    }
}
