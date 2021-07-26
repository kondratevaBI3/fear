import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parallelogram parallelogram = new Parallelogram();
        Quadrilateral quadrilateral = new Quadrilateral();
        Trapezoidal4 trapezoidal = new Trapezoidal4();
        Rectangle rectangle = new Rectangle();
        Rhombus rhombus = new Rhombus();
        System.out.println("1. parallelogram \n " +
                "2.quadrilateral \n " +
                "3.trapezoidal4 \n " +
                "4.rectangle \n " +
                "5.rhombus \n " +
                "Enter a figure that you want: ");
        String f = sc.nextLine();
        if (f.equalsIgnoreCase("parallelogram")) {
            System.out.println("This is parallelogram");
            parallelogram.print();

        }
        if (f.equalsIgnoreCase("quadrilateral")) {
            System.out.println("This is quadrilateral");
            quadrilateral.print();
        }
        if (f.equalsIgnoreCase("trapezoidal")) {
            System.out.println("This is trapezoidal");
            trapezoidal.print();
        }
        if (f.equalsIgnoreCase("rectangle")) {
            System.out.println("This is rectangle");
            rectangle.print();
        }
        if (f.equalsIgnoreCase("rhombus")) {
            System.out.println("This is rhombus");
            rhombus.print();
        }

    }
}

