package com.pv.insurance;

public class PlaygroundLoops {

    public static void main(String[] args){
        System.out.println("Demo de boucles en java");

        // for
        for (int i = 1; i<11; i++){

            System.out.println("i = " + i);
        }

        //while
        //Tant que compteur est inférieur ou égal à 5, continue de faire cette action.
        // À chaque tour, ajoute +1."
        // jusqua ce qu'il arrive a la ensuite arrete
        int compteur = 1;
        while (compteur <= 5) {
            System.out.println("compteur = " + compteur);
            compteur++;
        }

        // while decroissant
        //"Tant que compteur est plus grand ou égal à 0, fais cette action.
        // À chaque tour, enlève 1."
        int compteur2 = 10;
        while (compteur2 >= 0) {
            System.out.println("compteur = " + compteur2);
            compteur2--;
        }

        //do...while
        //"Fais cette action une fois, puis vérifie la condition.
        //Si la condition est encore vraie, continue. Sinon, arrête
        int x = 1;
        do {
            System.out.println("x vaut : " + x);
            x++;
        } while (x <= 10);

        //foreach
        String[] marques = {"Toyota", "BMW", "Tesla", "Renault"};
        int[] dates = {1,2,3,4,5};
        double[] kgs = {1.2,3.2,4.5};

        for (String marque: marques){
            System.out.println("Marque : " + marque);
        }
        for(int date: dates){
            System.out.println("Date : " + date);
        }

        for(double kg: kgs ){

            System.out.println(kg);
        }

        //5. if dans une boucle + break / continue
        for (int i = 1; i <=10; i++){
            if (i == 5){
                System.out.println("i vaut 5, je saute");
                continue;
            }

            if (i == 8){
                System.out.println("i vaut 8, je saute");
                break;
            }

            System.out.println("i = " + i);

        }


        // for	Quand tu sais combien de fois répéter
        //while	Quand tu répètes tant qu'une condition
        //do...while	Quand tu veux faire au moins une fois
        //foreach	Quand tu parcours une liste/tableau
        //break	Pour sortir de la boucle immédiatement
        //continue	Pour sauter un tour de boucle




    }
}
