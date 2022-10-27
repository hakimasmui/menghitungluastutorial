package com.kaspin.menghitungluastutorial.model;

public class LuasModel {
    int panjang;
    int lebar;

    public LuasModel(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungLuas() {
        return panjang * lebar;
    }
}
