package com.pv.insurance;

public class PlayGroundMethod {

    public static void direBonjour(){
        System.out.println("Bonjour !");
    }

    public static void direBonjourNom(String nom){
        System.out.println("Salut " + nom + " !");
    }

    // Si il n’y a pas void, alors la méthode doit retourner une valeur avec return.
    public static int doubler(int nombre){
        return nombre *2;
    }

    public static String direNomComplet(String prenom, String nom){

        String result = "prenom: " + prenom + ", nom: " + nom;
        return result;
    }

    public static boolean estMajeur(int age){
        return age>= 18;
    }

    public static long carreLong(long valeur){
        return valeur * valeur;
    }

    public static char premiereLettre(String mot) {
        return mot.charAt(2);
    }

    public static double tva(double montant){
        return montant * 0.21;
    }


    public static void main(String[] args){
        direBonjour();
        direBonjourNom("Adil");

        //doubler
        double resultat = doubler(40);
        System.out.println("resultat = " + resultat);

        //direNomComplet
        String resultaat = direNomComplet("Patrick", "Jane");
        System.out.println(resultaat);

        //estMajeur
        boolean majeur = estMajeur(15);
        System.out.println(majeur);

        //carreLong
        long carre = carreLong(50L);
        System.out.println(carre);

        //premiereLettre
        String unmot = String.valueOf(premiereLettre("SALUT")); // sa donne automatiquement
        System.out.println(unmot);

        //tva
        Double prix = tva(50);
        System.out.println(prix);


        // autre façon de proceder
        System.out.println(direNomComplet("Adil", "Hassan"));      // String
        System.out.println(estMajeur(22));                          // boolean
        System.out.println(carreLong(100000L));                     // long
        System.out.println(premiereLettre("Voiture"));             // char
        System.out.println("TVA sur 100€ : " + tva(100));
    }
}
