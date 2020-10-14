package edu.monix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElektronikShop {

    public int billigTast(int[] Tastatur){  //gibt die billigste Tastatur zuruck
        return NPosZahlen.minZahl(Tastatur);
    }


    public int teuerGegenstand(int[]Tastatur, int[] USB ){  //gibt den teuersten Gegenstand zuruck
        int maxTast=NPosZahlen.maxZahl(Tastatur);
        int maxUSB=NPosZahlen.maxZahl(USB);

        if (maxTast>maxUSB)
            return maxTast;
        else
            return maxUSB;
    }


    public int budgetUSB(int[] USB,int budget){ //gibt die teuerste Laufwerk,die Markus kaufen kann, zurück
        int maxPreisUSB=0;
        for(int i=0;i< USB.length;i++){
            if (maxPreisUSB<USB[i] && budget>=USB[i])
                maxPreisUSB=USB[i];
        }
        return maxPreisUSB;
    }


    public int geldbetrag(int[] Tastatur,int[] USB, int budget){
        int[] sortierteTast= Tastatur;
        Arrays.sort(sortierteTast);

        int[] sortierteUSB= USB;
        Arrays.sort(sortierteUSB);

        if(budget<sortierteUSB[0]+sortierteTast[0]) //wenn der Geld fur nichts genugt
            return -1;

        int i=Tastatur.length-1;
        int k=USB.length-1;
        while (i>=0 && k>=0) {
            if(Tastatur[i]+USB[k]<=budget)
                return Tastatur[i]+USB[k];
            else
                if (Tastatur[i]<USB[k])
                    if (i!=0)
                            i=i-1;
                    else
                        k=k-1;
                else
                    if(k!=0)
                        k=k-1;
                    else
                        i=i-1;
        }
        return Tastatur[i]+USB[k];
    };
}
