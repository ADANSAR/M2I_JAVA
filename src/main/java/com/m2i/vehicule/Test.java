package com.m2i.vehicule;

public class Test {

    public Test() {

    }

    public static void main(String[] args) {
        Vehicule maMoto = new Moto("Kawazaki");
        maMoto.setVitesse(250);
        Vehicule maVoit = new Voiture("Audi", 300);
        System.out.println(maMoto);
        System.out.println(maVoit);
    }

}
