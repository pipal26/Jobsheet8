import java.util.Scanner;
public class RataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        float nilaiMhs,totalNilai,rataNilai;

        i=1;
        while (i<=5) {
            totalNilai=0;
            System.out.println("Input nilai mahasiswa ke-"+i );
            for (int j=1; j<=5; j++){
                System.out.print("nilai ke-"+j+" : ");
                nilaiMhs = sc.nextFloat();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata nilai mahasiswa ke-"+i+" : "+rataNilai);
            i++;
        }
    }
}
