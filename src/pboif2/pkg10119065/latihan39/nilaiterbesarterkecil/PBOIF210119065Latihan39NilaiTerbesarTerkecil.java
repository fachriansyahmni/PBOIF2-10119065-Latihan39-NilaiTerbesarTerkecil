package pboif2.pkg10119065.latihan39.nilaiterbesarterkecil;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan nilai terkecil dan terbesar
                          dengan objek
 */
public class PBOIF210119065Latihan39NilaiTerbesarTerkecil {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Petugas petugas = new Petugas();
        Mahasiswa[] mhs;
        int minNilai,maxNilai;
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        petugas.setNama(sc.next());
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int totMahasiswa = sc.nextInt();
        mhs = new Mahasiswa[totMahasiswa];
        
        for(int i = 0; i < totMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" = ");
            mhs[i] = new Mahasiswa();
            mhs[i].setNilai(sc.nextInt());
        }
        minNilai = mhs[0].getNilai();
        maxNilai = mhs[0].getNilai();
        
        System.out.println("\n====Hasil Nilai Mahasiswa====");
        for(int i = 0; i < totMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-"+(i+1)+" = " + mhs[i].getNilai());
            if(mhs[i].getNilai() > maxNilai){
                maxNilai = mhs[i].getNilai();
            }else if(mhs[i].getNilai() < minNilai)
            {
                minNilai = mhs[i].getNilai();
            }
        }
        
        System.out.println("\nNilai Terkecil = "+minNilai);
        System.out.println("Nilai Terbesar = "+maxNilai);
        
        
        System.out.println("\nPetugas : " + petugas.getNama());
        System.out.println("\n(Developed by : Fachriansyah Muhammad Nur Ihsan");
    }
    
}
