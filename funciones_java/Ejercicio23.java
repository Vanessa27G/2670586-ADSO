public class Ejercicio23{

    public static void main(String[] args) {
        double capitalInicial = 1000.0; 
        double tasaInteres = 5.0;
        int periodo = 5; 
        double montoFinal = calcularMontoInteresCompuesto(capitalInicial, tasaInteres, periodo);
        System.out.println("El monto final de la inversión es: $" + montoFinal);
    }

    public static double calcularMontoInteresCompuesto(double capitalInicial, double tasaInteres, int periodo) {
        double tasaInteresDecimal = tasaInteres / 100.0;

        double montoFinal = capitalInicial * Math.pow(1 + tasaInteresDecimal, periodo);

        return montoFinal;
    }
}
