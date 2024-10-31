import java.util.Scanner;

public class SearchNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        int hasil = 0;

        System.out.print("Masukkan banyaknya nilai yang akan di input : ");
        int input = sc.nextInt();
        int[] arrNilai = new int[input];

        for(int i = 0; i < arrNilai.length; i ++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin di cari : ");
        key = sc.nextInt();
        for(int i = 0; i < arrNilai.length; i ++){
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        if (hasil == 0) {
            System.out.println();
            System.out.println("Nilai yang dicari tidak di termukan");
        } else {
            System.out.println();
            System.out.println("Nilai " + key + "ketemu , Merupakan nilai mahasiswa ke-" + (hasil+1));
        }
    }
}
