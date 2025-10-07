package view;

import java.util.ArrayList;

import controller.MatKulController;
import model.dto.MataKuliah;
import util.Dialog;

public class MatKulView {
    private MatKulController matKulController;

    public void setMatKulController(MatKulController matKulController) {
        this.matKulController = matKulController;
    }

    public void menu() {

        StringBuilder menu = new StringBuilder();
        menu.append("=== Menu MatKul ===\n");
        menu.append("1. Tambah MatKul\n");
        menu.append("2. Tambah MatKul Pilihan\n");
        menu.append("3. Print MatKul\n");
        menu.append("4. Kembali\n");

        int pilihan =  Dialog.inputInt(menu.toString());

        while(pilihan != 4) {

            switch (pilihan) {
                case 1:
                    this.inputMatKul();
                    break;
                case 2:
                    this.inputMatKulPilihan();
                    break;
                case 3:
                    matKulController.printAllMatKul();
                    break;
                default:
                    break;
            }
            
            pilihan = Dialog.inputInt(menu.toString());
        }
    }

    public void inputMatKul() {
        String kode = Dialog.inputString("Masukkan kode matkul: ");
        String nama = Dialog.inputString("Masukkan nama matkul: ");
        int sks = Dialog.inputInt("Masukkan jumlah SKS: ");

        matKulController.tambahMatKul(kode, nama, sks);
    }

    public void inputMatKulPilihan() {
        String kode = Dialog.inputString("Masukkan kode matkul: ");
        String nama = Dialog.inputString("Masukkan nama matkul: ");
        int sks = Dialog.inputInt("Masukkan jumlah SKS: ");
        int minPeserta = Dialog.inputInt("Masukkan jumlah minimum peserta: ");

        matKulController.tambahMatKul(kode, nama, sks, minPeserta);
    }

    public void printMatKulList(ArrayList<MataKuliah> allMatKul) {
        for (MataKuliah m : allMatKul) {
            Dialog.outputInfo(m.toString());
        }
    }
}