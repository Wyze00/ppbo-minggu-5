package model.dto;

public class User {
    private String nama, alamat, ttl, telepon;

    public User(String nama, String alamat, String ttl, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
    }

    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getTtl() { return ttl; }
    public String getTelepon() { return telepon; }
    public void setNama(String nama) { this.nama = nama; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public void setTtl(String ttl) { this.ttl = ttl; }
    public void setTelepon(String telepon) { this.telepon = telepon; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nama: ").append(nama).append("\n");
        sb.append("Alamat: ").append(alamat).append("\n");
        sb.append("TTL: ").append(ttl).append("\n");
        sb.append("Telepon: ").append(telepon).append("\n");
        return sb.toString();
    }
}