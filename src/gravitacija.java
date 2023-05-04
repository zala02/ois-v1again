import java.util.Scanner;

public class Gravitacija {
    public static void main(String[] args) {

        System.out.println("OIS je zakon!");

        Scanner scanner = new Scanner(System.in);
        double visina = scanner.nextDouble();

        double C = 6.674e-11;
        double M = 5.972e24;
        double r = 6.371e24;

        double a = (C * M) / Math.pow((r + visina), 2);

        System.out.println(a);
        System.out.println("kr neki");
    }
}