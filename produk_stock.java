// Program untuk mengelola produk dan stok
class Produk {
    String nama;
    int stok;

    Produk(String nama, int stok) {
        this.nama = nama;
        this.stok = stok;
    }

    void tambahStok(int jumlah) {
        stok += jumlah;
    }

    void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Kaos", 10);
        Produk produk2 = new Produk("Topi", 5);

        produk1.kurangiStok(3);
        produk2.tambahStok(2);

        System.out.println("Stok " + produk1.nama + ": " + produk1.stok);
        System.out.println("Stok " + produk2.nama + ": " + produk2.stok);
    }
}
