// Program sederhana untuk mekanisme penyewaan mobil
class Mobil {
    String merk;
    int tahun;
    boolean tersedia;

    Mobil(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
        tersedia = true;
    }

    void sewa() {
        tersedia = false;
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 2020);
        mobil.sewa();
        System.out.println("Mobil tersedia: " + mobil.tersedia);
    }
}
