import java.util.Scanner;

public class Star14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan nilai N = ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}