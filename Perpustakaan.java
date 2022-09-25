package UKL_Perpustakaan;

public class Perpustakaan {
    public static void main(String[] args) {
        Siswa siswa = new Siswa();
        Buku buku = new Buku();
        Peminjaman peminjaman = new Peminjaman();
        Laporan laporan = new Laporan();
        Petugas petugas = new Petugas();


        laporan.laporan(buku);
        laporan.laporan(siswa);
        laporan.laporan(petugas);
        laporan.laporan(peminjaman, buku);
    }
}

