package view;

import java.util.ArrayList;

import controller.MahasiswaController;
import model.dto.Mahasiswa;
import util.Dialog;

public class MahasiswaView {
    private MahasiswaController mahasiswaController;

    public MahasiswaView() {
    }

    public void setMahasiswaController(MahasiswaController mahasiswaController) {
        this.mahasiswaController = mahasiswaController;
    }

    public void menu() {

        StringBuilder menu = new StringBuilder();
        menu.append("=== Menu Mahasiswa ===\n");
        menu.append("1. Tambah Mahasiswa Sarjana\n");
        menu.append("2. Tambah Mahasiswa Magister\n");
        menu.append("3. Print Mahasiswa\n");
        menu.append("4. Tambah MatKul Mahasiswa\n");
        menu.append("5. Kembali\n");

        int pilihan =  Dialog.inputInt(menu.toString());

        while(pilihan < 5) {

            switch (pilihan) {
                case 1:
                    this.inputMahasiswaSarjana();
                    break;
                case 2:
                    this.inputMahasiswaMagister();
                    break;
                case 3:
                    mahasiswaController.printAllMahasiswa();
                    break;
                case 4:
                    this.inputMahasiswaTambahMatkul();
                    break;
                default:
                    break;
            }
            
            pilihan = Dialog.inputInt(menu.toString());
        }
    }

    public void inputMahasiswaSarjana() {
        String nim = Dialog.inputString("Masukkan NIM mahasiswa: ");
        String nama = Dialog.inputString("Masukkan nama mahasiswa: ");
        String jurusan = Dialog.inputString("Masukkan jurusan mahasiswa: ");
        String alamat = Dialog.inputString("Masukkan alamat mahasiswa: ");
        String ttl = Dialog.inputString("Masukkan tanggal lahir mahasiswa: ");
        String telepon = Dialog.inputString("Masukkan nomor telepon mahasiswa: ");

        mahasiswaController.tambahMahasiswa(nama, nim, jurusan, alamat, ttl, telepon);
    }

    public void inputMahasiswaMagister() {
        String nim = Dialog.inputString("Masukkan NIM mahasiswa: ");
        String nama = Dialog.inputString("Masukkan nama mahasiswa: ");
        String jurusan = Dialog.inputString("Masukkan jurusan mahasiswa: ");
        String alamat = Dialog.inputString("Masukkan alamat mahasiswa: ");
        String ttl = Dialog.inputString("Masukkan tanggal lahir mahasiswa: ");
        String telepon = Dialog.inputString("Masukkan nomor telepon mahasiswa: ");
        String judulTesis = Dialog.inputString("Masukkan judul tesis mahasiswa: ");

        mahasiswaController.tambahMahasiswa(nama, nim, jurusan, alamat, ttl, telepon, judulTesis);
    }

    public void printMahasiswaList(ArrayList<Mahasiswa> allMahasiswa) {
        for (Mahasiswa m : allMahasiswa) {
            Dialog.outputInfo(m.toString());
        }
    }

    public void inputMahasiswaTambahMatkul(){
        String nim = Dialog.inputString("Masukkan NIM mahasiswa: ");
        String kode = Dialog.inputString("Masukkan Kode MatKul: ");

        mahasiswaController.tambahMahasiswaMatKul(nim, kode);
    }
}
