# Mengimpor kelas PedagangKambingTurunan dan KambingTurunan
from pedagang_kambing import LokasiPedagang

def main():
    # Object: membuat objek pedagang_slamet dari kelas PedagangKambingTurunan
    pedagang_slamet = LokasiPedagang("Bapak Haji Slamet", "Jawa Barat")

    # Metode turunan PedagangKambingTurunan
    pedagang_slamet.tampilkan_lokasi()

    # Input awal kambing yang dibeli
    jumlah_kambing = int(input("Masukkan jumlah kambing yang dibeli: "))
    for i in range(jumlah_kambing):
        berat_awal = float(input(f"Masukkan berat awal kambing ke-{i+1}: "))
        tinggi_awal = float(input(f"Masukkan tinggi awal kambing ke-{i+1}: "))
        panjang_awal = float(
            input(f"Masukkan panjang awal kambing ke-{i+1}: "))
        pedagang_slamet.beli_kambing(berat_awal, tinggi_awal, panjang_awal)

    # Perkembangan selama 3 bulan
    for bulan in range(1, 4):
        pedagang_slamet.lihat_perkembangan(bulan)

    # Output perkembangan sebelum kambing mati
    print("\nSebelum kambing mati:")
    pedagang_slamet.lihat_perkembangan(4)

    # Kambing mati
    jumlah_kambing_mati = int(input("Masukkan jumlah kambing yang mati: "))
    pedagang_slamet.kambing_mati(jumlah_kambing_mati)

    # Output perkembangan setelah kambing mati
    print("\nSetelah kambing mati:")

    # Sehingga, perkembangan kambing mati dihitung setelah melihat perkembangan sisa kambing
    pedagang_slamet.lihat_perkembangan(5)


if __name__ == "__main__":
    main()
