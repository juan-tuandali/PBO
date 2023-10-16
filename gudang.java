// Program sederhana gudang barang
class Barang {
    String nama;
    int stok;

    Barang(String nama, int stok) {
        this.nama = nama;
        this.stok = stok;
    }
}

class Gudang {
    Barang[] inventaris;

    Gudang(Barang[] inventaris) {
        this.inventaris = inventaris;
    }
}

public class Main {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Pisau", 100);
        Barang barang2 = new Barang("Gergaji", 50);

        Barang[] barangGudang1 = {barang1, barang2};
        Gudang gudang1 = new Gudang(barangGudang1);

        System.out.println("Stok Pisau: " + barang1.stok);
        System.out.println("Stok Gergaji: " + barang2.stok);
    }
}
