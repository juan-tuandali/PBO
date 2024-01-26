from kambing import Kambing

# class PedagangKambing
class PedagangKambing:
    # constructor untuk inisialisasi objek
    def __init__(self, nama_pedagang="Bapak Haji Slamet"):
        self.nama_pedagang = nama_pedagang
        # relasi - asosiasi: objek PedagangKambing memiliki list objek Kambing
        self.kambing_list = []

    # metode untuk membeli kambing dan menambahkannya ke dalam list
    def beli_kambing(self, berat_awal, tinggi_awal, panjang_awal):
        kambing = Kambing(berat_awal, tinggi_awal, panjang_awal)
        self.kambing_list.append(kambing)

    # metode untuk melihat perkembangan kambing selama bulan tertentu
    def lihat_perkembangan(self, bulan):
        print(f"Perkembangan pada bulan ke-{bulan}:")
        for kambing in self.kambing_list:
            # abstraksi: menggunakan metode pertumbuhan pada objek Kambing
            kambing.pertumbuhan(bulan)
            print(
                f"Berat = {kambing.berat:.1f} kg, Tinggi = {kambing.tinggi:.1f} cm, Panjang = {kambing.panjang:.1f} cm")

    # metode untuk mengurus kambing yang mati
    def kambing_mati(self, jumlah_kambing_mati):
        if jumlah_kambing_mati > 0 and jumlah_kambing_mati <= len(self.kambing_list):
            # relasi - asosiasi: menghapus kambing yang mati dari list
            for _ in range(jumlah_kambing_mati):
                self.kambing_list.pop(0)
        else:
            print("Jumlah kambing yang mati tidak valid.")


class LokasiPedagang(PedagangKambing):
    # constructor tambahan untuk PedagangKambingTurunan
    def __init__(self, nama_pedagang, lokasi):
        # Memanggil konstruktor kelas induk
        super().__init__(nama_pedagang)
        # Fungsi tambahan untuk PedagangKambingTurunan
        self.lokasi = lokasi

    # Metode tambahan untuk PedagangKambingTurunan
    def tampilkan_lokasi(self):
        print(f"Lokasi Pedagang: {self.lokasi}")
