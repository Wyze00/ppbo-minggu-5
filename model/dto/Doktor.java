package model.dto;

public class Doktor extends Mahasiswa {
    private String judulDisertasi;
    int nilaiSidang1;
    int nilaiSidang2;
    int nilaiSidang3;

    public Doktor(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, String judulDisertasi) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.judulDisertasi = judulDisertasi;
    }

    public String getJudulDisertasi() { return judulDisertasi; }
    public void setJudulDisertasi(String judulDisertasi) { this.judulDisertasi = judulDisertasi; }
    public int getNilaiSidang1() { return nilaiSidang1; }
    public int getNilaiSidang2() { return nilaiSidang2; }
    public int getNilaiSidang3() { return nilaiSidang3; }
    public void setNilaiSidang1(int nilaiSidang1) { this.nilaiSidang1 = nilaiSidang1; }
    public void setNilaiSidang2(int nilaiSidang2) { this.nilaiSidang2 = nilaiSidang2; }
    public void setNilaiSidang3(int nilaiSidang3) { this.nilaiSidang3 = nilaiSidang3; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Judul Disertasi: ").append(judulDisertasi).append("\n");
        sb.append("Nilai Sidang 1: ").append(nilaiSidang1).append("\n");
        sb.append("Nilai Sidang 2: ").append(nilaiSidang2).append("\n");
        sb.append("Nilai Sidang 3: ").append(nilaiSidang3).append("\n");
        return sb.toString();
    }
}