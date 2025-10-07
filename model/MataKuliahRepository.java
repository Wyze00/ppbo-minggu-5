package model;

import java.util.ArrayList;

import model.dto.MataKuliah;

public class MataKuliahRepository {
    private ArrayList <MataKuliah> mataKuliahList = new ArrayList<MataKuliah>();

    public void addMataKuliah(MataKuliah mataKuliah) {
        mataKuliahList.add(mataKuliah);
    }

    public ArrayList<MataKuliah> getMataKuliahList() {
        return mataKuliahList;
    }
}
