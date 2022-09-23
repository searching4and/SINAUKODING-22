import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

            System.out.print("Masukkan jumlah mahasiswa di kelas: ");
            int jmlSiswa = input.nextInt();

            for (int i = 0; i < jmlSiswa; i++){
                Mahasiswa mahasiswa = new Mahasiswa();

                System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
                System.out.print("NIM : ");
                mahasiswa.setNim(input.next());

                System.out.print("Nama : ");
                mahasiswa.setNama(input.next());

                System.out.print("UTS : ");
                mahasiswa.setUts(input.nextInt());

                System.out.print("UAS : ");
                mahasiswa.setUas(input.nextInt());
                System.out.println("================================");

                daftarMahasiswa.add(mahasiswa);
                mahasiswa.totalNilai = (mahasiswa.getUts()*30/100)+(mahasiswa.getUas()*70/100);
                
                if (mahasiswa.totalNilai>=70){
                mahasiswa.setGrade("Lulus!");
                }      
                else if (mahasiswa.totalNilai<70){
                    mahasiswa.setGrade("Tidak Lulus!");
                }   
            }

            int n = 1;
            System.out.println("======== DAFTAR MAHASISWA ========");
            for (Mahasiswa data : daftarMahasiswa){
                System.out.println("Data Mahasiswa " + n);
                System.out.println("NIM : " + data.getNim());
                System.out.println("Nama : " + data.getNama());
                System.out.println("Nilai UTS : " + data.getUts());
                System.out.println("Nilai UAS : "+ data.getUas());
                System.out.println("Nilai Akhir : "+ data.getTotalNilai());
                System.out.println("Anda Dinyatakan "+ data.getGrade());
                System.out.println();

                n++;
            
            }
        }

        
    }
}