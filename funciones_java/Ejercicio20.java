public class Ejercicio20{

    public static void main(String[] args) {
        double base = 5.0; 
        double altura = 7.0; 
        double area = calcularAreaTriangulo(base, altura);
        System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es " + area);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }
}
