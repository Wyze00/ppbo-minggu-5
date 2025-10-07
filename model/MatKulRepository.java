package model;

import java.util.ArrayList;
import model.dto.MataKuliah;

public class MatKulRepository {
    private ArrayList <MataKuliah> matKulList = new ArrayList<MataKuliah>();

    public void addMatKul(MataKuliah mataKuliah) {
        matKulList.add(mataKuliah);
    }

    public ArrayList<MataKuliah> getMatKulList() {
        return matKulList;
    }

    public MataKuliah getMatKulByKode(String kode){

        for(MataKuliah m : matKulList){
            if (m.getKode().equalsIgnoreCase(kode)) {
                return m;
            }
        }

        return null;
    }
}
