package UKL_Perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Peminjaman {

    private ArrayList<Integer> idSiswa = new ArrayList<>();
    private ArrayList<Integer> idBuku = new ArrayList<>();
    private ArrayList<Integer> banyak = new ArrayList<>();

    public Peminjaman() {
        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(1);

        this.idSiswa.add(1);
        this.idBuku.add(1);
        this.banyak.add(1);

        this.idSiswa.add(0);
        this.idBuku.add(2);
        this.banyak.add(1);
    }

    public int getIdSiswa(int id){
        return this.idSiswa.get(id);
    }

    public int getIdBuku(int id){
        return this.idBuku.get(id);
    }

    public int getBanyak(int id){
        return this.banyak.get(id);
    }

    public int getTotalId(){
        return this.idSiswa.size();
    }
}