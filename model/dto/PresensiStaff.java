package model.dto;

public class PresensiStaff extends Presensi {
    private int jam;

    public PresensiStaff(String tanggal, Status status, int jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public int getJam() { return jam; }
    public void setJam(int jam) { this.jam = jam; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Jam: ").append(jam).append("\n");
        return sb.toString();
    }
}