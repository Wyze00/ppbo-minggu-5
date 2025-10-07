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
}
