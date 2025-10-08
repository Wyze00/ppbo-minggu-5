package view;

import java.lang.reflect.Array;
import java.util.ArrayList;

import controller.KaryawanController;
import model.dto.Karyawan;
import model.dto.Status;
import util.Dialog;

public class KaryawanView {
    private KaryawanController karyawanController;

    public void setKaryawanController(KaryawanController karyawanController) {
        this.karyawanController = karyawanController;
    }

    public void menu(){
        StringBuilder menu = new StringBuilder();
        menu.append("=== Menu Karyawan ===\n");
        menu.append("1. Tambah Karyawan\n");
        menu.append("2. Print Semua Karyawan\n");
        menu.append("3. Tambah Absen Karyawan\n");
        menu.append("4. Kembali\n");

        int pilihan =  Dialog.inputInt(menu.toString());

        while(pilihan < 4) {

            switch (pilihan) {
                case 1:
                    this.inputKaryawan();
                    break;
                case 2:
                    karyawanController.printAllKaryawan();
                    break;
                case 3:
                    this.inputKaryawanTambahAbsen();
                    break;
                default:
                    break;
            }
            
            pilihan = Dialog.inputInt(menu.toString());
        }
    }

    public void inputKaryawan(){
        String nip = Dialog.inputString("Masukkan NIP karyawan: ");
        String nama = Dialog.inputString("Masukkan nama karyawan: ");
        String alamat = Dialog.inputString("Masukkan alamat karyawan: ");
        String ttl = Dialog.inputString("Masukkan tanggal lahir karyawan: ");
        String telepon = Dialog.inputString("Masukkan nomor telepon karyawan: ");
        int salary = Dialog.inputInt("Masukkan gaji karyawan: ");

        karyawanController.tambahKaryawan(nama, alamat, ttl, telepon, nip, salary);
    }

    public void inputKaryawanTambahAbsen(){
        String id = Dialog.inputString("Masukkan NIP karyawan: ");
        String tanggal = Dialog.inputString("Masukkan tanggal absen (dd-mm-yyyy): ");
        Status status = Dialog.inputStatus("Masukkan status absen (HADIR, SAKIT, IJIN, ALPHA): ");
        int jam = Dialog.inputInt("Masukkan jam kerja: ");

        karyawanController.addPresensiStaff(id, tanggal, status, jam);
    }

    public void printKaryawanList(ArrayList<Karyawan> allKaryawan) {
        for(Karyawan k : allKaryawan) {
            Dialog.outputInfo(k.toString());
        }
    }
}
