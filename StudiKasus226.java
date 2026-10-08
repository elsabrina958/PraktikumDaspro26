import java.util.Scanner;

public class StudiKasus226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisKegiatan;
        String juaraHarapan, peserta;
        String peringkatJuara;
        String statusPendanaanPKM;
        int namaMahasiswa;
        int jmlDokumen;

        System.out.println("Masukkan nama mahasiwa");
        namaMahasiswa = sc.nextInt();
        System.out.println("Pilih jenis kegiatan");
        jenisKegiatan = sc.nextLine();
        System.out.println("Masukkan jumlah dokumen yang diupload");
        jmlDokumen = sc.nextInt();
        System.out.println("Masukkan peringkat juara");
        peringkatJuara = sc.nextLine();
        System.out.println("Apakah anda lolos pendanaan");
        statusPendanaanPKM = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase ("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            if (peringkatJuara.equalsIgnoreCase ("1") || peringkatJuara.equalsIgnoreCase  ("2") || peringkatJuara.equalsIgnoreCase ("3")) {
                 System.out.println("Selamat! anda mendapatkan dana penghargaan");  
        } else {
            System.out.println("Juara harapan / peserta tidak memperoleh dana pernghargaan");
        }       
        if (statusPendanaanPKM.equalsIgnoreCase ("Lolos pendanaan")) {
            System.out.println("Dana penghargaan diberikan");
        } else if (jenisKegiatan.equalsIgnoreCase ("Lainnya")){
            System.out.println("Tidak memperoleh dana penghargaan");
        }
        if ()
            }
        }
    }
