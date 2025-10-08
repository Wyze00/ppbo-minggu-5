package controller;

import model.DosenRepository;
import model.MatKulRepository;
import model.dto.DosenHonorer;
import model.dto.DosenTetap;
import model.dto.MatkulAjar;
import view.DosenView;

public class DosenController {
    private DosenView dosenView;
    private DosenRepository dosenRepository;
    private MatKulRepository matKulRepository;

    public DosenController(DosenRepository dosenRepository, DosenView dosenView, MatKulRepository matKulRepository) {
        this.dosenView = dosenView;
        this.dosenRepository = dosenRepository;
        this.matKulRepository = matKulRepository;
    }

    public void menu() {
        dosenView.menu();
    }

    public void addDosenTetap(String nama, String alamat, String ttl, String telepon, String nip, String departement, int salary) {
        dosenRepository.addDosen(new DosenTetap(nama, alamat, ttl, telepon, nip, departement, salary));
    }

    public void addDosenHonorer(String nama, String alamat, String ttl, String telepon, String nip, String departement, int honorPerSks) {
        dosenRepository.addDosen(new DosenHonorer(nama, alamat, ttl, telepon, nip, departement, honorPerSks));
    }

    public void printAllDosen() {
        dosenView.printDosenList(dosenRepository.getDosenList());
    }

    public void addDosenAjarMatKul(String nip, String kode) {
        var dosen = dosenRepository.getDosenByNIP(nip);
        var matkul = matKulRepository.getMatKulByKode(kode);

        if(dosen != null && matkul != null) {
            dosen.addMataKuliahDiajar(new MatkulAjar(matkul));
        }
    }
}
