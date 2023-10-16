// Program menghitung umur seseorang
import java.util.Calendar;

class Orang {
    private String nama;
    private int tahunLahir;

    public Orang(String nama, int tahunLahir) {
        this.nama = nama;
        this.tahunLahir = tahunLahir;
    }

    public int hitungUmur() {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        return tahunSekarang - tahunLahir;
    }

    public String getNama() {
        return nama;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }
}

public class Main {
    public static void main(String[] args) {
        Orang orang1 = new Orang("John Doe", 1990);
        Orang orang2 = new Orang("Jane Smith", 1985);

        System.out.println(orang1.getNama() + " lahir pada tahun " + orang1.getTahunLahir());
        System.out.println("Umur " + orang1.getNama() + " adalah " + orang1.hitungUmur() + " tahun");

        System.out.println(orang2.getNama() + " lahir pada tahun " + orang2.getTahunLahir());
        System.out.println("Umur " + orang2.getNama() + " adalah " + orang2.hitungUmur() + " tahun");
    }
}
