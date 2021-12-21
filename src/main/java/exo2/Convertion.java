package exo2;

import java.util.Scanner;

public class Convertion {

    public Convertion() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Merci de saisir un nombre int");
                String intNumber = sc.nextLine();
                System.out.println("Merci de saisir un nombre float");
                String doubleNumber = sc.nextLine();
                int k = Integer.parseInt(intNumber);
                System.out.println("la conversion de l'entier donne " + k);
                System.out.println("Son double est " + 2 * k);
                double x = Double.parseDouble(doubleNumber);
                System.out.println("la conversion du double donne " + x);
                System.out.println("Son double est " + 2 * x);
            } catch (NullPointerException npe) {
                System.out.println("la chaine de caractère en entrée est null.");
            } catch (NumberFormatException e) {
                System.out.println(
                        "la chaine de caractère en entrée ne contient pas une valeur convertible.");
            }
        }
    }
}
