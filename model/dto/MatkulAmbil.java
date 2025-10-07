package model.dto;

import java.util.ArrayList;

public class MatkulAmbil {
    private MataKuliah mataKuliah;
    private ArrayList<Presensi> presensiList = new ArrayList<>();
    private int n1, n2, n3;

    public MatkulAmbil(MataKuliah mataKuliah, int n1, int n2, int n3) {
        this.mataKuliah = mataKuliah;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getMataKuliah() { return mataKuliah; }
    public ArrayList<Presensi> getPresensiList() { return presensiList; }
    public int getN1() { return n1; }
    public int getN2() { return n2; }
    public int getN3() { return n3; }
    public void setMataKuliah(MataKuliah mataKuliah) { this.mataKuliah = mataKuliah; }
    public void setN1(int n1) { this.n1 = n1; }
    public void setN2(int n2) { this.n2 = n2; }
    public void setN3(int n3) { this.n3 = n3; }
    public void addPresensi(Presensi presensi) { this.presensiList.add(presensi); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mata Kuliah: \n").append(mataKuliah.toString());
        sb.append("Nilai 1: ").append(n1).append("\n");
        sb.append("Nilai 2: ").append(n2).append("\n");
        sb.append("Nilai 3: ").append(n3).append("\n");
        sb.append("Presensi: \n");
        for (Presensi p : presensiList) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}