package edu.monix;
import java.util.Arrays;

public class ElektronikShop {     //PROBLEM4

    /**
     * gibt die billigste Tastatur zuruck
     * @param Tastatur ein Array von Preise
     * @return die billigste Tastatur
     */
    public int billigTast(int[] Tastatur){
        return NPosZahlen.minZahl(Tastatur);
    }

    /**
     * gibt den teuersten Gegenstand zuruck
     * @param Tastatur,USB 2 Arrays von Preise
     * @return der teuerste Gegenstand
     */
    public int teuerGegenstand(int[]Tastatur, int[] USB ){
        int maxTast=NPosZahlen.maxZahl(Tastatur);
        int maxUSB=NPosZahlen.maxZahl(USB);

        if (maxTast>maxUSB)
            return maxTast;
        else
            return maxUSB;
    }

    /**
     * gibt der teuerste Laufwerk,der Markus kaufen kann, zurück
     * @param USB ein Array von Preise
     * @param budget
     * @return der teuerste Laufwerk, der gekauft werden kann
     */
    public int budgetUSB(int[] USB,int budget){
        int maxPreisUSB=0;
        for(int i=0;i< USB.length;i++){
            if (maxPreisUSB<USB[i] && budget>=USB[i])
                maxPreisUSB=USB[i];
        }
        return maxPreisUSB;
    }

    /**
     * bestimmt den grosten Geldbetrag Markus ausgeben kann
     * @param Tastatur,USB 2 Arrays von Preise
     * @param budget
     * @return ein Geldetrag
     */
    public int geldbetrag(int[] Tastatur, int[] USB, int budget){
        int[] sortierteTast= Tastatur;
        Arrays.sort(sortierteTast);
                                                //es werden 2 kopien gemacht damit
        int[] sortierteUSB= USB;
        Arrays.sort(sortierteUSB);

        if(budget<sortierteUSB[0]+sortierteTast[0]) //wenn der Geld fur nichts genugt
            return -1;

        int i=sortierteTast.length-1;
        int k=sortierteUSB.length-1;
        while (i>=0 && k>=0) {              //beginnend vom Ende, solange Elemente in beiden Arrays sind
            if(sortierteTast[i]+sortierteUSB[k]<=budget)    //wenn die teuersten Elektroniken im budget sind dann ist die Suche fertig
                return sortierteTast[i]+sortierteUSB[k];
            else                                            //sonst,
                if (sortierteTast[i]<sortierteUSB[k])       //der billigste Elektronik(Tastatur vs. USB) wird geandert mit einer billigeren,
                    if (i!=0)                                   //im Fall wenn es keine andere Tastatur mehr gibt, nimmt man ein anderes USB
                            i=i-1;
                    else
                        k=k-1;
                else                                            //und umgekehrt
                    if(k!=0)
                        k=k-1;
                    else
                        i=i-1;
        }
        return sortierteTast[i]+sortierteUSB[k];
    };
}
