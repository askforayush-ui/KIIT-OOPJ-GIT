import java.util.Scanner;

class CountObjects {
    static int count = 0;

    CountObjects() {
        count++;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            new CountObjects();
        }

        System.out.println("no of objects=" + CountObjects.count);
    }
}
