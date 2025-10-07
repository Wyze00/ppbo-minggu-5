package model.dto;

public class DosenTetap extends Dosen {
    private int salary;

    public DosenTetap(String nama, String alamat, String ttl, String telepon, String nip, String departement, int salary) {
        super(nama, alamat, ttl, telepon, nip, departement);
        this.salary = salary;
    }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Salary: ").append(salary).append("\n");
        return sb.toString();
    }
}