package com.m2i.vehicule;

public class Voiture extends Vehicule {

    public Voiture(String marque, float vitesse) {
        super(marque);

        super.setVitesse(vitesse);
    }

    @Override
    public int getNbRoues() {
        return 4;
    }

}
