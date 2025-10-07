package controller;

import util.Dialog;

public class MainController {
    private MahasiswaController mahasiswaController;
    private MatKulController matKulController;

    public MainController(MahasiswaController mahasiswaController, MatKulController matKulController) {
        this.mahasiswaController = mahasiswaController;
        this.matKulController = matKulController;
    }

    public void start() {

        StringBuilder menu = new StringBuilder();
        menu.append("=== Pilih Menu ===\n");
        menu.append("1. Menu Mahasiswa\n");
        menu.append("2. Menu MatKul\n");
        menu.append("3. Kembali\n");

        int pilihan =  Dialog.inputInt(menu.toString());

        while(pilihan != 3) {

            switch (pilihan) {
                case 1:
                    mahasiswaController.menu();
                    break;
                case 2:
                    matKulController.menu();
                    break;
                default:
                    break;
            }
            
            pilihan = Dialog.inputInt(menu.toString());
        }
    }
}
