package model.dto;

public class DosenHonorer extends Dosen {
    private int honorPerSks;

    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String nip, String departement, int honorPerSks) {
        super(nama, alamat, ttl, telepon, nip, departement);
        this.honorPerSks = honorPerSks;
    }

    public int getHonorPerSks() { return honorPerSks; }
    public void setHonorPerSks(int honorPerSks) { this.honorPerSks = honorPerSks; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Honor Per SKS: ").append(honorPerSks).append("\n");
        return sb.toString();
    }
}