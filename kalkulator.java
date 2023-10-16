// Program kalkulator sederhana
class Kalkulator {
    int hasil;

    void tambah(int a, int b) {
        hasil = a + b;
    }

    void kurang(int a, int b) {
        hasil = a - b;
    }
}

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.tambah(5, 3);
        System.out.println("Hasil Penambahan: " + kalkulator.hasil);
    }
}
