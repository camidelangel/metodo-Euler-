package MetodoEuler;

public class MetodoEuler {
    public static void metodo(double x0, double y0, double h, double xFinal) {
        // Criterio de paro (numero total de pasos N)
        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("\n\t x_n\t y_n (Euler)");
        System.out.println("--------------------------------");
        System.out.printf("%d\t %.4f\t %.4f\n", 0, x, y);

        for (int i = 0; i < nPasos; i++) {
            // TODO: Realizar el calculo de la pendiente y la actualizacion de x y y
            y = y + h * EvaluarF.evaluarFuncion(x, y);
            x = x + h;
            System.out.printf("%d\t %.4f\t %.4f\n", i+1, x, y);
        }

        System.out.printf("\nf(x,y) = (%.4f, %.4f)\n", x, y);
    }
}