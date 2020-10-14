package edu.monix;

import java.util.Arrays;

public class NPosZahlen {

    public static int maxZahl( int[] Zahlen){   //sucht die Grosste Zahl des Arrays
        int max=Zahlen[0];
        for (int i=0; i<Zahlen.length;i++){
            if (i>max){
                max=Zahlen[i];}
        }
        return max;
    }


    public static int minZahl( int[] Zahlen){   //sucht die kleinste Zahl des Arrays
        int min=Zahlen[0];
        for (int i=0; i<Zahlen.length;i++){
            if (i<min){
                min=Zahlen[i];
            }
        }
        return min;
    }


    public static void show(int[] Zahlen){  //zeigt die Zahlen des Arrays auf dem Bildschirm
        for(int i=0;i< Zahlen.length;i++){
            System.out.print(Zahlen[i]);
        }
        System.out.println(' ');
    }


    public static int maxSum(int[] Zahlen){ //findet die maximale Summe von n-1 Zahlen
        int sum=0;
        Arrays.sort(Zahlen);
        for(int i= Zahlen.length-1; i>0; i--){
            sum=sum+Zahlen[i];
        }
        return sum;
    }


    public static int minSum(int[] Zahlen){ //findet die minimale Summe von n-1 Zahlen.
        int sum=0;
        for(int i=0; i< Zahlen.length-1; i++){
            sum=sum+Zahlen[i];
        }
        return sum;
    }
}
