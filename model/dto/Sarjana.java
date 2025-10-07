package model.dto;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> mataKuliahDiambil = new ArrayList<>();

    public Sarjana(String nama, String alamat, String ttl, String telepon, String nim, String jurusan) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
    }

    public ArrayList<MatkulAmbil> getMataKuliahDiambil() { return mataKuliahDiambil; }
    public void addMataKuliah(MatkulAmbil mk) { this.mataKuliahDiambil.add(mk); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Mata Kuliah Diambil: \n");
        for (MatkulAmbil mk : mataKuliahDiambil) {
            sb.append(mk.toString()).append("\n");
        }
        return sb.toString();
    }
}