// Program menghitung waktu untuk mencatat waktu mulai dan waktu berakhir
class PerekamanWaktu {
    long waktuMulai;
    long waktuBerhenti;

    void mulai() {
        waktuMulai = System.currentTimeMillis();
    }

    void berhenti() {
        waktuBerhenti = System.currentTimeMillis();
    }

    long hitungDurasi() {
        return waktuBerhenti - waktuMulai;
    }
}

public class Main {
    public static void main(String[] args) {
        PerekamanWaktu perekaman = new PerekamanWaktu();
        perekaman.mulai();

        // Simulasikan sesuatu yang memerlukan waktu
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        perekaman.berhenti();
        System.out.println("Durasi: " + perekaman.hitungDurasi() + " ms");
    }
}
