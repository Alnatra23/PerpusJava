package UKL_Perpustakaan;

public class Laporan {
    public void laporan(Buku buku){
        int total = buku.getTotalBuku();

        System.out.println();
        System.out.println("Tabel Buku");
        System.out.println();
        System.out.println("No Nama Buku     \t\t       Stok \t\tHarga");
        for (int i = 0; i < total; i++) {
            System.out.println((i+1) + ". " + buku.getNamaBuku(i) + "     \t" + buku.getStok(i) + "\t\t\t" + buku.getHarga(i));
        }
    }

    public void laporan(Siswa siswa){
        int total = siswa.getTotalSiswa();

        System.out.println();
        System.out.println("Daftar Nama siswa");
        System.out.println();
        System.out.println("No Nama Siswa \tAlamat \t\tTelepon \t\tStatus");
        for (int i = 0; i < total; i++) {
            System.out.println((i + 1) + ". " + siswa.getNamaSiswa(i) + "\t\t" + siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getStatus(i));
        }
    }
    public void laporan(Petugas petugas){
        int total = petugas.getTotalKaryawan();

        System.out.println();
        System.out.println("Daftar Nama Petugas");
        System.out.println();
        System.out.println("No Nama Petugas \tAlamat \t\tTelepon ");
        for (int i = 0; i < total; i++) {
            System.out.println((i + 1) + ". " + petugas.getNamaKaryawan(i) + "\t\t" +petugas.getAlamat(i) + "\t" + petugas.getTelepon(i));
        }
    }
    public void laporan(Peminjaman peminjaman, Buku buku){
        int total = peminjaman.getTotalId();

        System.out.println();
        System.out.println("Laporan Transaksi/Peminjaman");
        System.out.println();
        System.out.println("No Nama Buku   \t          Stok    Harga \tTotal");
        int price = 0;
        for (int i = 0; i < total; i++) {
            price = 0;
            int jumlah = peminjaman.getBanyak(i) * buku.getHarga(i);
            price += jumlah;

            System.out.println((i+1) + ". " + buku.getNamaBuku(i) + "\t" + peminjaman.getBanyak(i) + "\t    " + buku.getHarga(peminjaman.getIdBuku(i)) + "\t" + price);
        }
    }

}
