package controller;

import model.dto.MataKuliah;
import model.dto.MataKuliahPilihan;
import java.util.ArrayList;
import model.MatKulRepository;
import view.MatKulView;

public class MatKulController {
    private MatKulView matKulView;
    private MatKulRepository matKulRepository;

    public MatKulController(MatKulRepository matKulRepository, MatKulView matKulView) {
        this.matKulView = matKulView;
        this.matKulRepository = matKulRepository;
    }

    public void menu(){
        matKulView.menu();
    }

    public void tambahMatKul(String kode, String nama, int sks) {
        matKulRepository.addMatKul(new MataKuliah(kode, nama, sks));
    }

    public void tambahMatKul(String kode, String nama, int sks, int minPeserta) {
        matKulRepository.addMatKul(new MataKuliahPilihan(kode, nama, sks, minPeserta));
    }

    public void printAllMatKul() {
        ArrayList<MataKuliah> matkulList = matKulRepository.getMatKulList();
        matKulView.printMatKulList(matkulList);
    }
}