package model;

import java.util.ArrayList;

import model.dto.Mahasiswa;

public class MahasiswaRepository {
    private ArrayList<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

    public void addMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaList.add(mahasiswa);
    }

    public ArrayList<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }
}
