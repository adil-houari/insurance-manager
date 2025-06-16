package com.pv.insurance;

public class Playground {

    private static String hello = "Hello  world";

    public static void main(String[] args) {
        // type primitif:

        int annee = 2020;
        double prix = 15999.99;
        long kilometrage = 150000L;
        boolean estElectrique = false;
        char categorie = 'B';


        // type Objects
        String marque = "ferrari";
        String model = "sf90";


        System.out.println("annee " + annee);
        System.out.println("prix " + prix);
        System.out.println("kilometrage " + kilometrage);
        System.out.println("estElectrqie " + estElectrique);
        System.out.println("categorie " + categorie);

        System.out.println("marque " + marque);
        System.out.println("model " + model);

        System.out.println(" " + annee + prix + kilometrage +
                estElectrique + " " + categorie + marque + model + " " + hello.toUpperCase());

    }


}
