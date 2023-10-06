public class Ejercicio19{

    public static void main(String[] args) {
        double radio = 5.0; 
        double area = calcularAreaCirculo(radio);
        System.out.println("El área del círculo con radio " + radio + " es " + area);
    }

    public static double calcularAreaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
}
