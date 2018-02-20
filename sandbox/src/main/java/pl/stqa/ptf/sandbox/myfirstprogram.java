package pl.stqa.ptf.sandbox;

public class myfirstprogram {

    public static void main(String[] args) {
        hello("dddddd");
        hello("d");
        hello("d");

        double l = 5;
        System.out.println("Powierzchnia kwadratu o boku " + l + " = " + area(l));

        double a = 4, b = 3;
        System.out.println("Powierzchnia prostokonta o bokach " + a + " i " + b + " = " + area(a,b));
    }
    public static void hello(String somebody) {

        System.out.println("Hello, "+ somebody + "!");

    }
    public static double area (double l) {
        return l * l;

    }
    public static double area (double a, double b ) {
        return a * b;

    }


}

