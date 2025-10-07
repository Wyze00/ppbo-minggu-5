package model.dto;

public class Magister extends Sarjana {
    private String judulTesis;

    public Magister(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, String judulTesis) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.judulTesis = judulTesis;
    }

    public String getJudulTesis() { return judulTesis; }
    public void setJudulTesis(String judulTesis) { this.judulTesis = judulTesis; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Judul Tesis: ").append(judulTesis).append("\n");
        return sb.toString();
    }
}