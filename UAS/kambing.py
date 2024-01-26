# class Kambing
class Kambing:
    # constructor untuk inisialisasi objek
    def __init__(self, berat_awal, tinggi_awal, panjang_awal):
        self.berat = berat_awal
        self.tinggi = tinggi_awal
        self.panjang = panjang_awal

    # metode untuk menghitung pertumbuhan kambing
    def pertumbuhan(self, bulan):
        # abstraction: pertumbuhan dihitung berdasarkan bulan
        pertumbuhan_berat = 2 * bulan
        pertumbuhan_tinggi = 1 * bulan
        pertumbuhan_panjang = 3 * bulan
        # pertumbuhan kambing
        self.berat += pertumbuhan_berat
        self.tinggi += pertumbuhan_tinggi
        self.panjang += pertumbuhan_panjang
