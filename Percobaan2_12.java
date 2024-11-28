import java.util.Scanner;

public class Percobaan2_12 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");  
            return (1);
        } else if (y == 1) {
            System.out.print(x);  
            return x;
        } else {
            System.out.print(x + " x ");  
            return (x * hitungPangkat(x, y - 1)); 
        }
    }

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        int bilangan, pangkat, hasil;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = input12.nextInt();

        System.out.print("Pangkat: ");
        pangkat = input12.nextInt();

        System.out.print("Hasil perhitungan: ");
        hasil = hitungPangkat(bilangan, pangkat); 
        System.out.print(" x 1");  
        System.out.println(" = " + hasil);  
    }
}