// Program sederhana informasi mahasiswa
class Mahasiswa {
    String nama;
    int nim;

    Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("John Doe", 12345);
        mahasiswa.displayInfo();
    }
}
