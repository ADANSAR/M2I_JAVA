package com.m2i.vehicule;

public abstract class Vehicule {

    private final String marque;
    protected float vitesse;

    public Vehicule(String marque) {
        this.marque = marque;
    }

    public abstract int getNbRoues();

    /**
     *
     * @param vitesse
     */
    public void setVitesse(float vitesse) {
        this.vitesse = vitesse;
    }

    /**
     * @return the vitesse
     */
    public float getVitesse() {
        return vitesse;
    }

    /**
     * @return the marque
     */
    public String getMarque() {
        return marque;
    }

    @Override
    public String toString() {
        return "Mon vehicule de la marque : " + getMarque() + " avec " + getNbRoues()
                + " roues dont la vitesse est : " + getVitesse();
    }
}
