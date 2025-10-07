import java.util.ArrayList;
import model.dto.MataKuliah;
import model.dto.MataKuliahPilihan;
import model.dto.Sarjana;
import model.dto.Magister;
import model.dto.MatkulAmbil;
import model.dto.Presensi;
import model.dto.Status;
import model.dto.Dosen;
import model.dto.DosenTetap;
import model.dto.DosenHonorer;
import model.dto.MatkulAjar;
import model.dto.PresensiStaff;
import model.dto.Karyawan;

public class SIA {

    static ArrayList<MataKuliah> mataKuliahList = new ArrayList<MataKuliah>();
    static ArrayList<Sarjana> sarjanaList = new ArrayList<Sarjana>();
    static ArrayList<Dosen> dosenList = new ArrayList<Dosen>();
    static ArrayList<Karyawan> karyawanList = new ArrayList<Karyawan>();

    public static void main(String[] args) {

        System.out.println();
        // Data Dummy mata kuliah
        mataKuliahList.add(new MataKuliah("MK001", "Matematika", 3));
        mataKuliahList.add(new MataKuliah("MK002", "Fisika", 4));
        mataKuliahList.add(new MataKuliahPilihan("MK003", "Seni Budaya", 2, 10));

        // Data Dummy mahasiswa
        sarjanaList.add(new Sarjana("Alice", "Jl. Merdeka 1", "01-01-2000", "081234567890", "S12345", "Informatika"));
        sarjanaList.add(new Magister("Bob", "Jl. Merdeka 2", "02-02-1995", "089876543210", "M54321", "Sistem Informasi", "Analisis Sistem Informasi"));

        sarjanaList.get(0).addMataKuliah(new MatkulAmbil(mataKuliahList.get(0), 85, 90, 88));
        sarjanaList.get(0).getMataKuliahDiambil().get(0).addPresensi(new Presensi("01-09-2023", Status.HADIR));

        sarjanaList.get(0).addMataKuliah(new MatkulAmbil(mataKuliahList.get(1), 80, 70, 75));
        sarjanaList.get(0).getMataKuliahDiambil().get(1).addPresensi(new Presensi("02-09-2023", Status.ALPHA));
        sarjanaList.get(0).getMataKuliahDiambil().get(1).addPresensi(new Presensi("03-09-2023", Status.HADIR));

        sarjanaList.get(1).addMataKuliah(new MatkulAmbil(mataKuliahList.get(1), 90, 92, 94));
        sarjanaList.get(1).getMataKuliahDiambil().get(0).addPresensi(new Presensi("01-09-2023", Status.HADIR));

        System.out.println(sarjanaList.get(0).toString());
        System.out.println(sarjanaList.get(1).toString());

        // Data Dummy dosen
        dosenList.add(new DosenTetap("Dr. Smith", "Jl. Pendidikan 1", "10-10-1970", "081122334455", "D001", "Informatika", 10000000));
        dosenList.add(new DosenHonorer("Dr. Jane", "Jl. Pendidikan 2", "20-12-1980", "082233445566", "D002", "Sistem Informasi", 500000));

        dosenList.get(0).addMataKuliahDiajar(new MatkulAjar(mataKuliahList.get(0)));
        dosenList.get(0).getMataKuliahDiajar().get(0).addPresensiStaff(new PresensiStaff("01-09-2023", Status.HADIR, 2));
        dosenList.get(0).getMataKuliahDiajar().get(0).addPresensiStaff(new PresensiStaff("08-09-2023", Status.HADIR, 2));

        dosenList.get(0).addMataKuliahDiajar(new MatkulAjar(mataKuliahList.get(1)));
        dosenList.get(0).getMataKuliahDiajar().get(1).addPresensiStaff(new PresensiStaff("02-09-2023", Status.HADIR, 3));

        dosenList.get(1).addMataKuliahDiajar(new MatkulAjar(mataKuliahList.get(1)));

        dosenList.get(1).addMataKuliahDiajar(new MatkulAjar(mataKuliahList.get(2)));
        dosenList.get(1).getMataKuliahDiajar().get(1).addPresensiStaff(new PresensiStaff("03-09-2023", Status.ALPHA, 12));

        System.out.println(dosenList.get(0).toString());
        System.out.println(dosenList.get(1).toString());
        
        // Data Dummy karyawan
        karyawanList.add(new Karyawan("Mr. John", "Jl. Admin 1", "15-05-1985", "083344556677", "K001", 7000000));
        karyawanList.add(new Karyawan("Ms. Mary", "Jl. Admin 2", "25-07-1990", "084455667788", "K002", 6500000));

        karyawanList.get(0).addPresensiStaff(new PresensiStaff("01-09-2023", Status.HADIR, 8));
        karyawanList.get(0).addPresensiStaff(new PresensiStaff("02-09-2023", Status.HADIR, 8));

        System.out.println(karyawanList.get(0).toString());
        System.out.println(karyawanList.get(1).toString());
    }
}