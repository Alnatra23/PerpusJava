package UKL_Perpustakaan;
import java.util.ArrayList;

public class Petugas {
    private ArrayList<String> namaKaryawan = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();

    public Petugas() {
        this.namaKaryawan.add("Kekolaloby");
        this.alamat.add("Kediri");
        this.telepon.add("   08123456789");

        this.namaKaryawan.add("Amayang");
        this.alamat.add("    Malang");
        this.telepon.add("   08167897235");
    }

    public int getTotalKaryawan() {
        return this.namaKaryawan.size();
    }

    public void setNamaKaryawan(String nama) {
        this.namaKaryawan.add(nama);
    }

    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    public String getNamaKaryawan(int id) {
        return this.namaKaryawan.get(id);
    }

    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
}
