package model.dto;

import java.util.ArrayList;

public class MatkulAjar {
    private MataKuliah mataKuliah;
    private ArrayList<PresensiStaff> presensiStaffList = new ArrayList<>();

    public MatkulAjar(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public MataKuliah getMataKuliah() { return mataKuliah; }
    public ArrayList<PresensiStaff> getPresensiStaffList() { return presensiStaffList; }
    public void setMataKuliah(MataKuliah mataKuliah) { this.mataKuliah = mataKuliah; }
    public void addPresensiStaff(PresensiStaff presensiStaff) { this.presensiStaffList.add(presensiStaff); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mata Kuliah: \n").append(mataKuliah.toString());
        sb.append("Presensi Staff: \n");
        for (PresensiStaff ps : presensiStaffList) {
            sb.append(ps.toString()).append("\n");
        }
        return sb.toString();
    }
}