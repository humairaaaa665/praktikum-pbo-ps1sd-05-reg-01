package humaira.projectmodul03.guided.Circle01;

public class Circle01 {
    public static final double PI = 3.14159;

    public static double radiansToDegrees(double rads) {
        return rads * 180 / PI;
    }

    public double r;

    public double area() {
        return PI * r * r;
    }

    public double circumference() {
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        Circle01 lingkaran = new Circle01();
        lingkaran.r = 7;

        System.out.println("Jari-jari   : " + lingkaran.r);
        System.out.println("Luas        : " + lingkaran.area());
        System.out.println("Keliling    : " + lingkaran.circumference());
        System.out.println("1.5708 rad  : " + radiansToDegrees(1.5708) + " derajat");
    }
}