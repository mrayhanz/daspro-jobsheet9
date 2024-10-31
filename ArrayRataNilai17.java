import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        double total = 0;
        double rata2;
        int jumlahLulus = 0;
        int jumlahTidak = 0;
        int rata2Mhslulus = 0;
        int rata2Mhstidak = 0;

        System.out.print("Masukkan Jumlah Mahasiswa = ");
        input = sc.nextInt();

        int[] nilaiMhs = new int[input];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                rata2Mhslulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                rata2Mhstidak += nilaiMhs[i];
                jumlahTidak++;
            }
        }

        double nilaiMhslulus = rata2Mhslulus / jumlahLulus;
        double nilaiMhstidak = rata2Mhstidak / jumlahTidak;
        rata2 = total / nilaiMhs.length;

        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Rata-rata nilai lulus = " + nilaiMhslulus);
        System.out.println("Rata-rata nilai tidak lulus = " + nilaiMhstidak);

    }
}