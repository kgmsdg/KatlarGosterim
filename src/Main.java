import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        n = inp.nextInt();

        System.out.println("4'ün katları");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        System.out.println("\n5'İn katları");
        for (int j = 1; j <= n; j *= 5) {
            System.out.println(j);
        }
    }
}
