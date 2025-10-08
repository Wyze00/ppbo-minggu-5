package model;

import java.util.ArrayList;
import model.dto.Dosen;

public class DosenRepository {

    private ArrayList<Dosen> dosenList = new ArrayList<Dosen>();

    public void addDosen(Dosen dosen) {
        dosenList.add(dosen);
    }

    public ArrayList<Dosen> getDosenList() {
        return dosenList;
    }

    public Dosen getDosenByNIP(String nip) {
        for (Dosen dosen : dosenList) {
            if (dosen.getNip().equalsIgnoreCase(nip)) {
                return dosen;
            }
        }
        return null;
    }
}
