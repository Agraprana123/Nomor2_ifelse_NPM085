import java.util.Scanner;

public class nomordua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan sebuah angka (angka negatif untuk keluar): ");
            int inputAngka = scanner.nextInt();

            if (inputAngka < 0) {
                break;
            }

            if (inputAngka % 2 == 0) {
                System.out.println(inputAngka + " adalah angka genap.");
            } else {
                System.out.println(inputAngka + " adalah angka ganjil.");
            }
        }

        System.out.println("Terima kasih! Program selesai.");
    }
}