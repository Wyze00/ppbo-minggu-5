package model.dto;

import java.util.ArrayList;

public class Dosen extends Staff {
    private String departement;
    private ArrayList<MatkulAjar> mataKuliahDiajar = new ArrayList<>();

    public Dosen(String nama, String alamat, String ttl, String telepon, String nip, String departement) {
        super(nama, alamat, ttl, telepon, nip);
        this.departement = departement;
    }

    public String getDepartement() { return departement; }
    public ArrayList<MatkulAjar> getMataKuliahDiajar() { return mataKuliahDiajar; }
    public void setDepartement(String departement) { this.departement = departement; }
    public void addMataKuliahDiajar(MatkulAjar mk) { this.mataKuliahDiajar.add(mk); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Departement: ").append(departement).append("\n");
        sb.append("Mata Kuliah Diajar: \n");
        for (MatkulAjar mk : mataKuliahDiajar) {
            sb.append(mk.toString()).append("\n");
        }
        return sb.toString();
    }
}