// Program sederhana informasi buku
class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku("Java Programming", "John Smith");
        buku.displayInfo();
    }
}
