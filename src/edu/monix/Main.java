package edu.monix;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //aufgabe1
        System.out.println("Aufgabe1");
        Universitat Uni= new Universitat();
        int[] Noten = {20, 44, 35, 50, 73, 15, 80, 10, 72, 95, 81};
        System.out.print("alle Noten: ");
        for (int i = 0; i < Noten.length; i++) {
            System.out.print(Noten[i] + " ");
        }
        System.out.println(" ");

        int[] Restanta = Uni.kleineNoten(Noten);
        System.out.print("nicht ausreichende Noten: ");
        for (int i = 0; i < Restanta.length; i++) {
            if (Restanta[i] != 0) {
                System.out.print(Restanta[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("der Durchschnittswert ist " + Uni.Mittel(Noten));


        int[] abgerundeteNoten = Uni.Abrudnen(Noten);
        System.out.print("die abgerundete Noten: ");
        for (int i = 0; i < abgerundeteNoten.length; i++) {
            System.out.print(abgerundeteNoten[i] + " ");
        }
        System.out.println(" ");
        System.out.print("die maximale abgerundete Note: ");
        System.out.println(Uni.MaxAbrundeteNote(Noten));
        System.out.println(" ");

        //aufgabe2
        System.out.println("Aufgabe2");
        NPosZahlen array=new NPosZahlen();
        int n=5;
        int[] Zahlen={6,4,1,3,5};
        System.out.println("Array von Zahlen: ");
        array.show(Zahlen);
        System.out.println("maximale Zahl:"+array.maxZahl(Zahlen));
        System.out.println("minimale Zahl:"+array.minZahl(Zahlen));
        Arrays.sort(Zahlen);
        System.out.println("Array von sortierte Zahlen: ");
        array.show(Zahlen);
        System.out.println("maximale Summe:"+array.maxSum(Zahlen));
        System.out.println("minimale Summe:"+array.minSum(Zahlen));
        System.out.println(" ");

        //aufgabe3
        System.out.println("Aufgabe3");
        GrosseZahlen grZahlen=new GrosseZahlen();
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] rez = grZahlen.summe(zahl1, zahl2);
        System.out.print("die Summe: ");
        for (int i = 0; i < rez.length; i++)
            System.out.print(rez[i]);
        System.out.println(" ");

        int[] zahl3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] rez2 = grZahlen.differenz(zahl3, zahl4);
        System.out.print("die Differenz: ");
        for (int i = 0; i < rez2.length; i++)
            System.out.print(rez2[i]);
        System.out.println(" ");

        int[] zahl5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int zahl6 = 2;
        int[] rez3 = grZahlen.multiplication(zahl5, zahl6);
        System.out.print("die Multiplikation: ");
        for (int i = 0; i < rez3.length; i++)
            System.out.print(rez3[i]);
        System.out.println(" ");

        int[] zahl7 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int zahl8 = 2;
        int[] rez4 = grZahlen.division(zahl7, zahl8);
        System.out.print("die Division: ");
        for (int i = 0; i < rez4.length; i++)
            System.out.print(rez4[i]);

        System.out.println(" ");
        System.out.println(" ");
        //aufgabe4
        System.out.println("Aufgabe4");
    }
}
