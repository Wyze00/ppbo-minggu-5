package model.dto;

public class MataKuliahPilihan extends MataKuliah {
    private int jumblahMinimumPeserta;

    public MataKuliahPilihan(String kode, String nama, int sks, int jumblahMinimumPeserta) {
        super(kode, nama, sks);
        this.jumblahMinimumPeserta = jumblahMinimumPeserta;
    }
    public int getJumblahMinimumPeserta() { return jumblahMinimumPeserta; }
    public void setJumblahMinimumPeserta(int jumblahMinimumPeserta) { this.jumblahMinimumPeserta = jumblahMinimumPeserta; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Jumlah Minimum Peserta: ").append(jumblahMinimumPeserta).append("\n");
        return sb.toString();
    }
}