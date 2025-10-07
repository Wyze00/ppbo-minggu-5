package model;

import java.util.ArrayList;
import model.dto.Karyawan;

public class KaryawanRepository {
    private ArrayList<Karyawan> karyawanList = new ArrayList<Karyawan>();

    public void addKaryawan(Karyawan karyawan) {
        karyawanList.add(karyawan);
    }

    public ArrayList<Karyawan> getKaryawanList() {
        return karyawanList;
    }
}
