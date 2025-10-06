import java.util.ArrayList;

public class SIA {
    public static void main(String[] args) {
        
    }
}

enum Status {
    HADIR, ALPHA
}

class User {
    private String nama, alamat, ttl, telepon;

    public User(String nama, String alamat, String ttl, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

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

class Mahasiswa extends User {
    private String nim, jurusan;

    public Mahasiswa(String nama, String alamat, String ttl, String telepon, String nim, String jurusan) {
        super(nama, alamat, ttl, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("NIM: ").append(nim).append("\n");
        sb.append("Jurusan: ").append(jurusan).append("\n");

        return sb.toString();
    }
} 

class Sarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> mataKuliahDiambil = new ArrayList<>();

    public Sarjana(String nama, String alamat, String ttl, String telepon, String nim, String jurusan) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
    }

    public ArrayList<MatkulAmbil> getMataKuliahDiambil() {
        return mataKuliahDiambil;
    }

    public void addMataKuliah(MatkulAmbil mk) {
        this.mataKuliahDiambil.add(mk);
    }
}

class Magister extends Sarjana {
    private String judulTesis;

    public Magister(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, String judulTesis) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.judulTesis = judulTesis;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;   
    }
}

class Doktor extends Mahasiswa {
    private String judulDisertasi;
    int nilaiSidang1;
    int nilaiSidang2;
    int nilaiSidang3;

    public Doktor(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, String judulDisertasi) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.judulDisertasi = judulDisertasi;
    }

    public String getJudulDisertasi() {
        return judulDisertasi;
    }

    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public int getNilaiSidang1() {
        return nilaiSidang1;
    }

    public int getNilaiSidang2() {
        return nilaiSidang2;
    }

    public int getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang1(int nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public void setNilaiSidang2(int nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public void setNilaiSidang3(int nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }
}

class Staff extends User {
    private String nip;

    public Staff(String nama, String alamat, String ttl, String telepon, String nip) {
        super(nama, alamat, ttl, telepon);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}

class Dosen extends Staff {
    private String departement;
    private ArrayList<MatkulAjar> mataKuliahDiajar = new ArrayList<>();

    public Dosen(String nama, String alamat, String ttl, String telepon, String nip, String departement) {
        super(nama, alamat, ttl, telepon, nip);
        this.departement = departement;
    }

    public String getDepartement() {
        return departement;
    }

    public ArrayList<MatkulAjar> getMataKuliahDiajar() {
        return mataKuliahDiajar;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void addMataKuliahDiajar(MatkulAjar mk) {
        this.mataKuliahDiajar.add(mk);
    }
}

class DosenTetap extends Dosen {
    private int salary;

    public DosenTetap(String nama, String alamat, String ttl, String telepon, String nip, String departement, int salary) {
        super(nama, alamat, ttl, telepon, nip, departement);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class DosenHonorer extends Dosen {
    private int honorPerSks;

    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String nip, String departement, int honorPerSks) {
        super(nama, alamat, ttl, telepon, nip, departement);
        this.honorPerSks = honorPerSks;
    }

    public int getHonorPerSks() {
        return honorPerSks;
    }

    public void setHonorPerSks(int honorPerSks) {
        this.honorPerSks = honorPerSks;
    }
}

class Karyawan extends Staff {
    private int salary;
    ArrayList<PresensiStaff> PresensiStaffList = new ArrayList<>();

    public Karyawan(String nama, String alamat, String ttl, String telepon, String nip, int salary) {
        super(nama, alamat, ttl, telepon, nip);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public ArrayList<PresensiStaff> getPresensiStaffList() {
        return PresensiStaffList;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void addPresensiStaff(PresensiStaff presensi) {
        this.PresensiStaffList.add(presensi);
    }
}

class MataKuliah {
    private String kode, nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}

class MataKuliahPilihan extends MataKuliah {
    private int jumblahMinimumPeserta;

    public MataKuliahPilihan(String kode, String nama, int sks, int jumblahMinimumPeserta) {
        super(kode, nama, sks);
        this.jumblahMinimumPeserta = jumblahMinimumPeserta;
    }
    public int getJumblahMinimumPeserta() {
        return jumblahMinimumPeserta;
    }
    public void setJumblahMinimumPeserta(int jumblahMinimumPeserta) {
        this.jumblahMinimumPeserta = jumblahMinimumPeserta;
    }
}

class Presensi{
    private String tanggal;
    private Status status;

    public Presensi(String tanggal, Status status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public Status getStatus() {
        return status;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

class PresensiStaff extends Presensi {
    private int jam;

    public PresensiStaff(String tanggal, Status status, int jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }
}

class MatkulAmbil {
    private MataKuliah mataKuliah;
    private ArrayList<Presensi> presensiList = new ArrayList<>();
    private int n1, n2, n3;

    public MatkulAmbil(MataKuliah mataKuliah, int n1, int n2, int n3) {
        this.mataKuliah = mataKuliah;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public ArrayList<Presensi> getPresensiList() {
        return presensiList;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getN3() {
        return n3;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public void addPresensi(Presensi presensi) {
        this.presensiList.add(presensi);
    }
}

class MatkulAjar {
    private MataKuliah mataKuliah;
    private ArrayList<PresensiStaff> presensiStaffList = new ArrayList<>();

    public MatkulAjar(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public ArrayList<PresensiStaff> getPresensiStaffList() {
        return presensiStaffList;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void addPresensiStaff(PresensiStaff presensiStaff) {
        this.presensiStaffList.add(presensiStaff);
    }
}

