package controller;

import util.Dialog;

public class MainController {
    private MahasiswaController mahasiswaController;
    private MatKulController matKulController;
    private KaryawanController karyawanController;
    private DosenController dosenController;

    public MainController(MahasiswaController mahasiswaController, MatKulController matKulController, KaryawanController karyawanController, DosenController dosenController) {
        this.mahasiswaController = mahasiswaController;
        this.matKulController = matKulController;
        this.karyawanController = karyawanController;
        this.dosenController = dosenController;
    }

    public void start() {
        StringBuilder menu = new StringBuilder();
        menu.append("=== Pilih Menu ===\n");
        menu.append("1. Menu Mahasiswa\n");
        menu.append("2. Menu MatKul\n");
        menu.append("3. Menu Karyawan\n");
        menu.append("4. Menu Dosen\n");
        menu.append("5. Kembali\n");

        int pilihan =  Dialog.inputInt(menu.toString());

        while(pilihan != 5) {

            switch (pilihan) {
                case 1:
                    mahasiswaController.menu();
                    break;
                case 2:
                    matKulController.menu();
                    break;
                case 3:
                    karyawanController.menu();
                    break;
                case 4:
                    dosenController.menu();
                    break;
                default:
                    break;
            }
            
            pilihan = Dialog.inputInt(menu.toString());
        }
    }
}
