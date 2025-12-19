package Lab2;

import java.util.Scanner;

class Box {
    double length;
    double width;
    double height;

    double volume() {
        return length * width * height;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box b = new Box();
        b.length = sc.nextDouble();
        b.width = sc.nextDouble();
        b.height = sc.nextDouble();

        System.out.println("Volume: " + b.volume());
    }
}
