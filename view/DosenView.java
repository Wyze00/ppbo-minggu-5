package view;

import java.util.ArrayList;

import controller.DosenController;
import model.dto.Dosen;
import model.dto.Mahasiswa;
import util.Dialog;

public class DosenView {
    private DosenController dosenController;

    public void setDosenController(DosenController dosenController) {
        this.dosenController = dosenController;
    }

    public void menu() {

        StringBuilder menu = new StringBuilder();
        menu.append("=== Menu Mahasiswa ===\n");
        menu.append("1. Tambah Dosen Tetap\n");
        menu.append("2. Tambah Dosen Honorer\n");
        menu.append("3. Print All Dosen\n");
        menu.append("4. Tambah Dosen Ajar MatKul\n");
        menu.append("5. Kembali\n");

        int pilihan =  Dialog.inputInt(menu.toString());

        while(pilihan < 5) {

            switch (pilihan) {
                case 1:
                    this.inputDosenTetap();
                    break;
                case 2:
                    this.inputDosenHonorer();
                    break;
                case 3:
                    dosenController.printAllDosen();
                    break;
                case 4:
                    this.inputDosenAjarMatKul();
                    break;
                default:
                    break;
            }
            
            pilihan = Dialog.inputInt(menu.toString());
        }
    }

    public void inputDosenTetap() {
        String nip = Dialog.inputString("NIP Dosen Tetap:");
        String nama = Dialog.inputString("Nama Dosen Tetap:");
        String alamat = Dialog.inputString("Alamat Dosen Tetap:");
        String ttl = Dialog.inputString("TTL Dosen Tetap:");
        String telepon = Dialog.inputString("Telepon Dosen Tetap:");
        String departement = Dialog.inputString("Departement Dosen Tetap:");
        int salary = Dialog.inputInt("Salary Dosen Tetap:");

        dosenController.addDosenTetap(nama, alamat, ttl, telepon, nip, departement, salary);
    }

    public void inputDosenHonorer() {
        String nip = Dialog.inputString("NIP Dosen Honorer:");
        String nama = Dialog.inputString("Nama Dosen Honorer:");
        String alamat = Dialog.inputString("Alamat Dosen Honorer:");
        String ttl = Dialog.inputString("TTL Dosen Honorer:");
        String telepon = Dialog.inputString("Telepon Dosen Honorer:");
        String departement = Dialog.inputString("Departement Dosen Honorer:");
        int honorPerSks = Dialog.inputInt("Honor Per SKS Dosen Honorer:");

        dosenController.addDosenHonorer(nama, alamat, ttl, telepon, nip, departement, honorPerSks);
    }

    public void printDosenList(ArrayList<Dosen> allDosen) {
        for(Dosen d : allDosen) {
            Dialog.outputInfo(d.toString());
        }
    }

    public void inputDosenAjarMatKul(){
        String nip = Dialog.inputString("NIP Dosen:");
        String kode = Dialog.inputString("Kode MatKul:");

        dosenController.addDosenAjarMatKul(nip, kode);
    }
}
