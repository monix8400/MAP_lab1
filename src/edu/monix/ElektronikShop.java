package edu.monix;
import java.util.ArrayList;
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
            if (maxPreisUSB<USB[i] && budget>USB[i])
                maxPreisUSB=USB[i];
        }
        return maxPreisUSB;
    }


   // public int
}
