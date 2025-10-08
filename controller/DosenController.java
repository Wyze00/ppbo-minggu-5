package controller;

import model.DosenRepository;
import model.MatKulRepository;
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
}
