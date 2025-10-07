package model.dto;

public class Presensi {
    private String tanggal;
    private Status status;

    public Presensi(String tanggal, Status status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getTanggal() { return tanggal; }
    public Status getStatus() { return status; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }
    public void setStatus(Status status) { this.status = status; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tanggal: ").append(tanggal).append("\n");
        sb.append("Status: ").append(status).append("\n");
        return sb.toString();
    }
}