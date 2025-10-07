package model.dto;

public class MataKuliah {
    private String kode, nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getSks() { return sks; }
    public void setKode(String kode) { this.kode = kode; }
    public void setNama(String nama) { this.nama = nama; }
    public void setSks(int sks) { this.sks = sks; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kode: ").append(kode).append("\n");
        sb.append("Nama: ").append(nama).append("\n");
        sb.append("SKS: ").append(sks).append("\n");
        return sb.toString();
    }
}