class MesinPenjual {
    String minuman;
    double harga;
    int stok;

    MesinPenjual(String minuman, double harga, int stok) {
        this.minuman = minuman;
        this.harga = harga;
        this.stok = stok;
    }

    void jual() {
        if (stok > 0) {
            System.out.println("Mengeluarkan " + minuman + ". Harga: $" + harga);
            stok--;
        } else {
            System.out.println("Stok " + minuman + " habis.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MesinPenjual mesinMinuman = new MesinPenjual("Minuman Dingin", 2.0, 5);

        mesinMinuman.jual();
        mesinMinuman.jual();
        mesinMinuman.jual();
        mesinMinuman.jual();
        mesinMinuman.jual();
        mesinMinuman.jual();  // Stok habis
    }
}
