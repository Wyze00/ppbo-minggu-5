package model.dto;

public class Mahasiswa extends User {
    private String nim, jurusan;

    public Mahasiswa(String nama, String alamat, String ttl, String telepon, String nim, String jurusan) {
        super(nama, alamat, ttl, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() { return nim; }
    public String getJurusan() { return jurusan; }
    public void setNim(String nim) { this.nim = nim; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("NIM: ").append(nim).append("\n");
        sb.append("Jurusan: ").append(jurusan).append("\n");
        return sb.toString();
    }
}