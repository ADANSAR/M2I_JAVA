package com.m2i.vehicule;

public class Moto extends Vehicule {

    public Moto(String marque) {
        super(marque);
    }

    @Override
    public int getNbRoues() {
        return 2;
    }

}
