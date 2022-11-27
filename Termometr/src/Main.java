import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float a = Float.parseFloat(scanner.nextLine());
        float c = Float.parseFloat(scanner.nextLine());
        float d = Float.parseFloat(scanner.nextLine());

        int b = (int) a;
        int f1 = (int) ((c * 9 / 5) + 32);
        int c1 = (int) ((d - 32) * 5 / 9);


        System.out.println(f1);
        System.out.println(c1);

    }
}