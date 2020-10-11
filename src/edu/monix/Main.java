package edu.monix;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Aufgabe1");
        Universitat Uni= new Universitat();
        int[] Noten = {20, 44, 35, 50, 73, 15, 80, 10, 72, 95, 81};
        for (int i = 0; i < Noten.length; i++) {
            System.out.print(Noten[i] + " ");
        }
        System.out.println(" ");

        int[] Restanta = Uni.kleineNoten(Noten);
        for (int i = 0; i < Restanta.length; i++) {
            if (Restanta[i] != 0) {
                System.out.print(Restanta[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("der Durchschnittswert ist " + Uni.Mittel(Noten));


        int[] abgerundeteNoten = Uni.Abrudnen(Noten);
        for (int i = 0; i < abgerundeteNoten.length; i++) {
            System.out.print(abgerundeteNoten[i] + " ");
        }
        System.out.println(" ");

        System.out.println(Uni.MaxAbrundeteNote(Noten));
        System.out.println(" ");


        System.out.println("Aufgabe2");
        NPosZahlen array=new NPosZahlen();
        int n=5;
        int[] Zahlen={6,4,1,3,5};
        array.show(Zahlen);
        System.out.println("maximale Zahl:"+array.maxZahl(Zahlen));
        System.out.println("minimale Zahl:"+array.minZahl(Zahlen));
        Arrays.sort(Zahlen);
        array.show(Zahlen);
        System.out.println("maximale Summe:"+array.maxSum(Zahlen));
        System.out.println("minimale Summe:"+array.minSum(Zahlen));
        System.out.println(" ");
    }
}
