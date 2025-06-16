package com.pv.insurance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlaygroundList {


    public static void main(String[] args){
        System.out.println("Hello P&V");
        System.out.println("Demo Array list in java");

        //***************** ARRAY ***************
        String[] prenoms = {"Adil", "Kevin", "Jan"};
        System.out.println("Premier prénom : " + prenoms[0] );

        //creer un Array
        //Tu dois toujours connaître la taille à l'avance pour les tableaux.
        String[] villes = new String[4];
        villes[0] = "Bruxelles";
        villes[1] = "Paris";
        villes[2] = "Londres";
        villes[3] = "Lille";

        villes[1] = "Gand";

        // Tout afficher
        for (String ville: villes){
            System.out.println(ville);
        }

        System.out.println(Arrays.toString(villes));

        //afficher un specifique
        System.out.println(villes[0]);

        // 🧠 3. Peut-on mélanger int, String, etc. dans un Array ?
        //❌ En Java : Non


        //***************** ARRAYLIST ***************
        ArrayList<String> names = new ArrayList<>();
        names.add("Adil");
        names.add("Jan");
        names.add("Kevin");

        System.out.println("ArrayListe de tout les noms : " + names);

        for(String name: names){
            System.out.println("nom: " + name);
        }

        names.remove("Jan");
        System.out.println(names);


        //!
        names.set(1, "Sara");
        System.out.println(names);

        // !
        System.out.println(names.contains("Adil"));

        System.out.println(names.size());

        System.out.println(names.get(0));

        System.out.println(names);

        //creer un ArrayList deja rempli
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Paris", "Londres"));

        cities.add("Moscou");
        cities.add("Amsterdam");
        System.out.println(cities);
        cities.set(2, "Breda");
        System.out.println(cities);

        System.out.println(cities.contains("Breda"));
        System.out.println(cities.size());


        // Liste de départ
        ArrayList<String> prenoms2 = new ArrayList<>(Arrays.asList(
                "Adil", "Kevin", "Sara", "Tom", "Alex", "Sami"
        ));

        System.out.println("📋 Liste initiale : " + prenoms2);

        // 1. Afficher uniquement les prénoms qui commencent par 'A'
        System.out.println("\n✅ Prénoms qui commencent par A :");
        for (String p : prenoms2) {
            if (p.startsWith("A")) {
                System.out.println(p);
            }
        }

        // 2. Supprimer "Kevin" de la liste
        prenoms2.remove("Kevin");

        // 3. Remplacer "Tom" par "Jonathan"
        int indexTom = prenoms2.indexOf("Tom");
        if (indexTom != -1) {
            prenoms2.set(indexTom, "Jonathan");
        }

        // 4. Afficher la taille de la liste
        System.out.println("\n📏 Taille de la liste : " + prenoms2.size());

        // 5. Afficher la liste finale
        System.out.println("\n📦 Liste finale : " + prenoms2);

        //***************** LIST ***************

        List<String> countries = new ArrayList<>();
        countries.add("Belgium");
        countries.add("France");
        countries.add("Spain");

        for (String country: countries){
            System.out.println(country);
        }

        for (String country: countries){
            if (country.startsWith("B")){
                System.out.println(country);
            }
        }

        ArrayList<Integer> dates = new ArrayList<>(Arrays.asList(4,5,8,9,3));
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(8);
        dates.add(6);

        List<String> animals = new ArrayList<>();
        List<String> cars = new ArrayList<>(Arrays.asList("Bentley", "Porsche"));







    }



}
