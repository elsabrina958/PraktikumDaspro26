import java.util.Scanner;

public class StudiKasus126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;
        
        System.out.println("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.println("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();
        System.out.println("Total harga: Rp" );
        totalHarga = jumlahCup * hargaPerCup;
        totalHarga = sc.nextInt();
        diskon = 0;
        diskon = sc.nextInt();

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
            System.out.println(diskon);
        } else {
            totalBayar = totalHarga - diskon;
            System.out.println(totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println(kembalian);    
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" +kurang);
        }
        }
        sc.close();
    }
}
