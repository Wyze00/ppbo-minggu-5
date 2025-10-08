package controller;

import model.dto.Status;
import model.KaryawanRepository;
import model.dto.Karyawan;
import model.dto.PresensiStaff;
import view.KaryawanView;

public class KaryawanController {
    private KaryawanView karyawanView;
    private KaryawanRepository karyawanRepository;

    public KaryawanController(KaryawanRepository karyawanRepository, KaryawanView karyawanView) {
        this.karyawanView = karyawanView;
        this.karyawanRepository = karyawanRepository;
    }

    public void menu() {
        karyawanView.menu();
    }

    public void tambahKaryawan(String nama, String alamat, String ttl, String telepon, String nip, int salary) {
        Karyawan karyawan = new model.dto.Karyawan(nama, alamat, ttl, telepon, nip, salary);
        karyawanRepository.addKaryawan(karyawan);
    }

    public void printAllKaryawan() {
        karyawanView.printKaryawanList(karyawanRepository.getKaryawanList());
    }

    public void addPresensiStaff(String NIP, String tanggal, Status status, int jam) {
        Karyawan karyawan = karyawanRepository.getKaryawanByNIP(NIP);
        
        if(karyawan != null) {
            karyawan.addPresensiStaff(new PresensiStaff(tanggal, status, jam));
        }
    }
}
