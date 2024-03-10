package calismad1;

import java.util.Scanner;

public class lopchat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan elmasın yüksekliğini al
        System.out.print("Elmasın yüksekliğini girin: ");
        int yukseklik = scanner.nextInt();

        // Elması çiz
        elmasCiz(yukseklik);
    }

    static void elmasCiz(int n) {
        for (int i = 0; i < n; i++) {
            // Üst kısım
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            // Alt kısım
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
