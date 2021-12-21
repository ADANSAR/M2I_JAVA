package com.m2i.student;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // Create Student
        Student med = new Student();
        med.setEmail("test@m2i.fr");
        med.setNom("Dupont");
        med.setPrenom("Marc");
        med.setNumCarte("205 631 952");

        Student jean = new Student("Delattre", "Jean", "j.del@m2i.fr", "395 014 250");

        System.out.println(med);
        System.out.println("-----------------------------------------------------------");
        System.out.println(jean);
    }
}
