import java.util.Scanner;
public class Tugas_12 {
    static int hitungRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + hitungRekursif(n - 1);
        }
    }

    static int hitungIteratif(int n, int i, int total) {
        total = 0;
        for (i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
            int n, i, total;

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        n = input12.nextInt();

        int[] angka = new int[n];
        
        for (i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i - 1] = input12.nextInt();
        }

        total = 0;
        for (i = 0; i < n; i++) {
            total += angka[i];
        }

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + total);
    }
}