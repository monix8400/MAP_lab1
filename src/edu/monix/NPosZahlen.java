package edu.monix;

import java.util.Arrays;

public class NPosZahlen {     //PROBLEM2

    /**
     * sucht die Grosste Zahl des Arrays
     * @param Zahlen
     * @return die maximale Zahl
     */
    public static int maxZahl( int[] Zahlen){
        int max=Zahlen[0];
        for (int i=0; i<Zahlen.length;i++){
            if (Zahlen[i]>max){
                max=Zahlen[i];}
        }
        return max;
    }

    /**
     * sucht die kleinste Zahl des Arrays
     * @param Zahlen
     * @return die minimale Zahl
     */
    public static int minZahl( int[] Zahlen){
        int min=Zahlen[0];
        for (int i=0; i<Zahlen.length;i++){
            if (Zahlen[i]<min){
                min=Zahlen[i];
            }
        }
        return min;
    }

    /**
     * zeigt die Zahlen des Arrays auf dem Bildschirm
     * @param Zahlen
     */
    public static void show(int[] Zahlen){
        for(int i=0;i< Zahlen.length;i++){
            System.out.print(Zahlen[i]);
        }
        System.out.println(' ');
    }

    /**
     * findet die maximale Summe von n-1 Zahlen
     * @param Zahlen
     * @return die maximale Summe von n-1 Zahlen
     */
    public static int maxSum(int[] Zahlen){
        int sum=0;
        int[] sortierenZahlen=Zahlen;
        Arrays.sort(sortierenZahlen);
        for(int i= sortierenZahlen.length-1; i>0; i--){
            sum=sum+sortierenZahlen[i];
        }
        return sum;
    }

    /**
     * findet die minimale Summe von n-1 Zahlen
     * @param Zahlen
     * @return die minimale Summe von n-1 Zahlen
     */
    public static int minSum(int[] Zahlen){
        int sum=0;
        int[] sortierenZahlen=Zahlen;
        Arrays.sort(sortierenZahlen);
        for(int i=0; i< sortierenZahlen.length-1; i++){
            sum=sum+sortierenZahlen[i];
        }
        return sum;
    }
}
