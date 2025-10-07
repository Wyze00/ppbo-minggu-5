package model.dto;

public class Staff extends User {
    private String nip;

    public Staff(String nama, String alamat, String ttl, String telepon, String nip) {
        super(nama, alamat, ttl, telepon);
        this.nip = nip;
    }

    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("NIP: ").append(nip).append("\n");
        return sb.toString();
    }
}