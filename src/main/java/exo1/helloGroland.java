package exo1;

import java.util.Scanner;

public class helloGroland {

    public helloGroland() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Merci de saisir un nom:");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
    }

}
