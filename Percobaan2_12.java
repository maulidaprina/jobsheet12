import java.util.Scanner;
public class Percobaan2_12 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
            int bilangan, pangkat;
        
        System.out.print("Bilangan yang dihitung: ");
        bilangan =  input12.nextInt();
        
        System.out.print("Pangkat: ");
        pangkat = input12.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}

