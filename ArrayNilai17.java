import java.util.Scanner;

public class ArrayNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for(int i = 0;i < nilaiAkhir.length;i++){
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0;i < nilaiAkhir.length;i++){
            if(nilaiAkhir[i] > 70){
                System.out.println("Nilai Akhir ke-" + i + " Lulus!");    
            }else{
                System.out.println("Tidak lulus!");
            }
        }
    }
}
