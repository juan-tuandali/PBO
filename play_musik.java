// Program sederhana pemutar musik
class Lagu {
    String judul;
    String artis;

    Lagu(String judul, String artis) {
        this.judul = judul;
        this.artis = artis;
    }

    void putar() {
        System.out.println("Memutar lagu: " + judul + " - " + artis);
    }
}

public class Main {
    public static void main(String[] args) {
        Lagu lagu = new Lagu("Imagine", "John Lennon");
        lagu.putar();
    }
}
