package MetodoEuler;

public class Main {
    public static void main(String[] args) {
        double x0 = 0.0;
        double y0 = 1.0;
        double h = 0.1; // Variar este valor en el reporte (ej. 0.1, 0.05, 0.01)
        double xFinal = 0.3;

        MetodoEuler.metodo(x0, y0, h, xFinal);
    }
}
