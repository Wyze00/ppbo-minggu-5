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

    public Mahasiswa getMahasiswaByNIM(String nim) {

        for(Mahasiswa m : mahasiswaList){
            if (m.getNim().equalsIgnoreCase(nim)) {
                return m;
            }
        }

        return null;
    }
}
