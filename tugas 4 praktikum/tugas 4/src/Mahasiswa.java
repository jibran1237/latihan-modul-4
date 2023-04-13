import java.util.Scanner;
import java.util.HashMap;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa (String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = kl;
        nim = ni;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1.", new Mahasiswa("Putri", "3H", "Struktur Data", 2020000));
        mhs.put("1.", new Mahasiswa("Agus", "3A", "Matematika", 2020000));
        mhs.put("1.", new Mahasiswa("Arro", "3D", "Pemrogaman", 2020000));
        
        System.out.println("Masukkan ID:");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " +
            data.kelas + ", mata kuliah praktikum : " + data.matkulPraktikum +
            ", nim : " + data.nim);
        }
    }
}