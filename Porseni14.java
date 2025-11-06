import java.util.Scanner;

public class Porseni14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int JUMLAH_ATLET_PER_CABOR = 5;
        
        String namaPoltek;
        String[] cabor = {"badminton", "tenis meja", "basket", "bola voly"};

        System.out.println("=== INPUT DATA ATLET PORSENI ===");

        System.out.print("Masukkan Nama Politeknik: ");
        namaPoltek = sc.nextLine();

        System.out.println("\n[ DATA ATLET UNTUK " + namaPoltek.toUpperCase() + " ]");

        for (int c = 0; c < cabor.length; c++) {
            System.out.println("  Cabang " + cabor[c] + ":");
            
            System.out.println("    5 Nama Atlet: ");
            
            for (int a = 0; a < JUMLAH_ATLET_PER_CABOR; a++) {
                String namaAtlet = sc.next(); 
                if (a < JUMLAH_ATLET_PER_CABOR - 1) {
                    System.out.print(", ");
                }
            }
            sc.nextLine(); 
            System.out.println(); 
        }

        System.out.println("\nData telah dimasukkan. Program Selesai.");
        sc.close();
    }
}
