package model.dto;

import java.util.ArrayList;

public class Karyawan extends Staff {
    private int salary;
    ArrayList<PresensiStaff> PresensiStaffList = new ArrayList<>();

    public Karyawan(String nama, String alamat, String ttl, String telepon, String nip, int salary) {
        super(nama, alamat, ttl, telepon, nip);
        this.salary = salary;
    }

    public int getSalary() { return salary; }
    public ArrayList<PresensiStaff> getPresensiStaffList() { return PresensiStaffList; }
    public void setSalary(int salary) { this.salary = salary; }
    public void addPresensiStaff(PresensiStaff presensi) { this.PresensiStaffList.add(presensi); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Salary: ").append(salary).append("\n");
        sb.append("Presensi Staff: \n");
        for (PresensiStaff ps : PresensiStaffList) {
            sb.append(ps.toString()).append("\n");
        }
        return sb.toString();
    }
}