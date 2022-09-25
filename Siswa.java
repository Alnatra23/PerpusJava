package UKL_Perpustakaan;
import Array.pengguna;

import java.util.ArrayList;
public class Siswa implements pengguna {
    private ArrayList<String> namaSiswa = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();
    private ArrayList<Boolean> Status = new ArrayList<>();

    public Siswa() {
        this.namaSiswa.add("Yoga");
        this.alamat.add("    Kediri");
        this.telepon.add("    082314563478");
        this.Status.add(true);

        this.namaSiswa.add("Alip");
        this.alamat.add("    Gresik");
        this.telepon.add("    081222233344");
        this.Status.add(true);
    }

    public boolean getStatus(int id) {
        return this.Status.get(id);
    }

    public void setStatus(boolean status) {
        this.Status.add(status);
    }

    public void editStatus(int id, boolean status) {
        this.Status.set(id, status);
    }

    public int getTotalSiswa() {
        return this.namaSiswa.size();
    }

    public void setNamaSiswa(String nama) {
        this.namaSiswa.add(nama);
    }

    @Override
    public void setNama(String namaPetugas) {

    }

    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public void setStatus(Boolean Status) {

    }

    public String getNamaSiswa(int id) {
        return this.namaSiswa.get(id);
    }

    @Override
    public String getNama(int idPetugas) {
        return null;
    }

    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    public String getTelepon(int id) {
        return this.telepon.get(id);
    }


}
