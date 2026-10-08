import java.util.Scanner;

public class StudiKasus226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisKegiatan;
        String juaraHarapan, peserta;
        String peringkatJuara;
        String statusPendanaanPKM;
        String namaMahasiswa;
        int jmlDokumen;

        System.out.println("Masukkan nama mahasiwa");
        namaMahasiswa = sc.nextLine();
        System.out.println("Masukkan jenis kegiatan");
        jenisKegiatan = sc.nextLine();
        System.out.println("Masukkan jumlah dokumen yang diupload");
        jmlDokumen = sc.nextInt();
        System.out.println("Masukkan peringkat juara");
        peringkatJuara = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase ("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            peringkatJuara = sc.nextLine();
            if (peringkatJuara.equalsIgnoreCase ("1") || peringkatJuara.equalsIgnoreCase  ("2") || peringkatJuara.equalsIgnoreCase ("3")) {
                 System.out.println("Selamat! anda mendapatkan dana penghargaan");  
            } else {
                System.out.println("Juara harapan / peserta tidak memperoleh dana pernghargaan");
            }       
        } else if (jenisKegiatan.equalsIgnoreCase("pkm")) {
            statusPendanaanPKM = sc.nextLine();
            if (statusPendanaanPKM.equalsIgnoreCase("1")) {
                System.out.println("Selamat! Anda mendapatkan dana penghargaan");
            } else {
                if (jenisKegiatan.equalsIgnoreCase("Lainnya")) {
                    System.out.println("Mohon maaf anda tidak memperoleh dana penghargaan");
                }
            }
        }
        if (jmlDokumen == 4) {
            System.out.println("Dokumen anda lengkap dan anda mendapatkan dana penghargaan");
        } else if(jmlDokumen < 4 ) {
            System.out.println("Tidak lengkap dan dana penghargaan tidak diberikan");
        }
        if (peringkatJuara.equalsIgnoreCase ("1") || peringkatJuara.equalsIgnoreCase("2") || peringkatJuara.equalsIgnoreCase("3") && jmlDokumen == 4) {
            System.out.println("Dokumen lengkap dan anda mendapatkan dana penghargaan");
        } else {
            System.out.println("Data tidak lengkap, anda tidak mendapatkan dana penghargaan");
        }
    }
}