// Program sederhana pemesanan makanan
class Makanan {
    String nama;
    double harga;

    Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    void cetakPesanan() {
        System.out.println("Pesanan: " + nama + ", Harga: $" + harga);
    }
}

public class Main {
    public static void main(String[] args) {
        Makanan makanan = new Makanan("Pizza", 10.99);
        makanan.cetakPesanan();
    }
}
