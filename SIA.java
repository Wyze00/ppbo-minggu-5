import model.dto.Status;
import controller.DosenController;
import controller.KaryawanController;
import controller.MahasiswaController;
import controller.MainController;
import controller.MatKulController;
import view.DosenView;
import view.KaryawanView;
import view.MahasiswaView;
import view.MatKulView;
import model.DosenRepository;
import model.KaryawanRepository;
import model.MahasiswaRepository;
import model.MatKulRepository;

public class SIA {

    public static void main(String[] args) {

        // Init MatKul
        MatKulRepository matKulRepository = new MatKulRepository();
        MatKulView matKulView = new MatKulView();
        MatKulController matKulController = new MatKulController(matKulRepository, matKulView);
        matKulView.setMatKulController(matKulController);

        // Init Mahasiswa
        MahasiswaRepository mahasiswaRepository = new MahasiswaRepository();
        MahasiswaView mahasiswaView = new MahasiswaView();
        MahasiswaController mahasiswaController = new MahasiswaController(mahasiswaRepository, mahasiswaView, matKulRepository);
        mahasiswaView.setMahasiswaController(mahasiswaController);

        // Init Karyawan
        KaryawanRepository karyawanRepository = new KaryawanRepository();
        KaryawanView karyawanView = new KaryawanView();
        KaryawanController karyawanController = new KaryawanController(karyawanRepository, karyawanView);
        karyawanView.setKaryawanController(karyawanController);

        // Init Dosen
        DosenRepository dosenRepository = new DosenRepository();
        DosenView dosenView = new DosenView();
        DosenController dosenController = new DosenController(dosenRepository, dosenView, matKulRepository);
        dosenView.setDosenController(dosenController);

        // Data Dummy
        matKulController.tambahMatKul("M001", "Matematika", 3);
        matKulController.tambahMatKul("M002", "Fisika", 4);
        matKulController.tambahMatKul("M003", "Seni Budaya", 2, 10);

        mahasiswaController.tambahMahasiswa("A", "1", "informatika", "Jl", "1", "1");
        mahasiswaController.tambahMahasiswa("A", "2", "informatika", "Jl", "1", "1");
        mahasiswaController.tambahMahasiswa("A", "3", "informatika", "Jl", "1", "1", "Tesis");

        mahasiswaController.tambahMahasiswaMatKul("1", "M001");
        mahasiswaController.tambahMahasiswaMatKul("1", "M002");
        mahasiswaController.tambahMahasiswaMatKul("2", "M002");
        mahasiswaController.tambahMahasiswaMatKul("3", "M002");

        karyawanController.tambahKaryawan("Karyawan 1", "Jl", "1", "1", "1", 7000000);
        karyawanController.tambahKaryawan("Karyawan 2", "Jl", "1", "1", "2", 6500000);

        karyawanController.addPresensiStaff("1", "01-09-2023", Status.HADIR, 8);
        karyawanController.addPresensiStaff("1", "02-09-2023", Status.HADIR, 8);
        karyawanController.addPresensiStaff("2", "01-09-2023", Status.HADIR, 8);

        dosenController.tambahDosenTetap("Dosen 1", "Jl", "1", "1", "1", "Informatika", 10000000);
        dosenController.tambahDosenHonorer("Dosen 2", "Jl", "1", "1", "2", "Sistem Informasi", 500000);

        dosenController.tambahDosenAjarMatKul("1", "M001");
        dosenController.tambahDosenAjarMatKul("1", "M002");
        dosenController.tambahDosenAjarMatKul("2", "M002");

        // Init App
        MainController mainController = new MainController(mahasiswaController, matKulController, karyawanController, dosenController);
        mainController.start();

        // Uncomment kalau mau lihat semua data
        // matKulController.printAllMatKul();
        // mahasiswaController.printAllMahasiswa();
        // karyawanController.printAllKaryawan();
        // dosenController.printAllDosen();
    }
}