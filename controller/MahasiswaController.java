package controller;

import java.util.ArrayList;

import model.MahasiswaRepository;
import model.MatKulRepository;
import model.dto.Magister;
import model.dto.Mahasiswa;
import model.dto.MataKuliah;
import model.dto.MatkulAmbil;
import model.dto.Sarjana;
import view.MahasiswaView;

public class MahasiswaController {
    private MahasiswaView mahasiswaView;
    private MahasiswaRepository mahasiswaRepository;
    private MatKulRepository matKulRepository;

    public MahasiswaController(MahasiswaRepository mahasiswaRepository, MahasiswaView mahasiswaView, MatKulRepository matKulRepository) {
        this.mahasiswaRepository = mahasiswaRepository;
        this.mahasiswaView = mahasiswaView;
        this.matKulRepository = matKulRepository;
    }

    public void menu() {
        mahasiswaView.menu();
    }

    public void tambahMahasiswa(String nama, String nim, String jurusan, String alamat, String ttl, String telepon) {
        mahasiswaRepository.addMahasiswa(new Sarjana(nama, alamat, ttl, telepon, nim, jurusan));
    }

    public void tambahMahasiswa(String nama, String nim, String jurusan, String alamat, String ttl, String telepon, String judulTesis) {
        mahasiswaRepository.addMahasiswa(new Magister(nama, alamat, ttl, telepon, nim, jurusan, judulTesis));
    }

    public void printAllMahasiswa() {
        ArrayList<Mahasiswa> allMahasiswa = mahasiswaRepository.getMahasiswaList();
        mahasiswaView.printMahasiswaList(allMahasiswa);
    }

    public void tambahMahasiswaMatKul(String nim, String kode){

        Mahasiswa mhs = mahasiswaRepository.getMahasiswaByNIM(nim);
        MataKuliah matKul = matKulRepository.getMatKulByKode(kode);

        if(mhs instanceof Sarjana) {
            ((Sarjana)mhs).addMataKuliah(new MatkulAmbil(matKul, 0, 0, 0));
        }
    }
}
