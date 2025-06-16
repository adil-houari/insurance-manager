package com.pv.insurance;

public class Playground2 {

    // objects et primitf (donc variable en dehors de la function main)
    String model = "ferrari";
    int annee = 450000;
    double kilometrage = 15000.63;
    long kg = 800L;



    public static void main(String[] args) {
        // quand c'est en dehors
        Playground2 p = new Playground2();
        System.out.println(p.model);
        System.out.println(p.annee);

        //interieur:
        String model2 = "bentley";
        int annee2 = 2020;
        double kilometrage2 = 14000.6;
        long kg2 = 80L;

        System.out.println("model2 = " + model2 );

    }





}
