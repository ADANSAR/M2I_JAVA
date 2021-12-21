package com.m2i.student;

public class Student extends Personne {

    private String numCarte;

    public Student() {
        // default constructor
        super();
    }

    public Student(String nom, String prenom, String email, String numCarte) {
        super(nom, prenom, email);
        setNumCarte(numCarte);
    }

    /**
     * @return the numCarte
     */
    public String getNumCarte() {
        // 521 632 923 donne 521632923
        return numCarte;
    }

    /**
     * @param numCarte
     *            the numCarte to set
     */
    public void setNumCarte(String numCarte) {
        this.numCarte = numCarte.replace(" ", "");
    }

    @Override
    public String toString() {
        return "Etudiant " + getPrenom() + " " + getNom() + " dont le numCarte est : "
                + getNumCarte();
    }
}
