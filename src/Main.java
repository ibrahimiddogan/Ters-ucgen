import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını girin: ");
        int basamakSayisi = scanner.nextInt();

        for (int satir = basamakSayisi; satir >= 1; satir--) {
            for (int yildiz = 1; yildiz <= satir; yildiz++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}