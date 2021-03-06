package edu.monix;

public class Universitat {     //PROBLEM1

    /**
     * liefert ein Array der nichtausreichender Noten zuruck
     * @param Noten
     * @return ein Array der nichtausreichender Noten
     */
    public static int[] kleineNoten(int[] Noten) {
        int[] Restanta=new int[Noten.length];
        int k=0;
        for(int i=0; i<Noten.length; i++){
            if (Noten[i]<40){
                Restanta[k]=Noten[i];
                k++;
            }
        }

        return Restanta;
    }

    /**
     * berechnet den Durchschnitt der Noten
     * @param Noten
     * @return der Durchschnitt
     */
    public static float Mittel(int[] Noten){
        int sum=0;
        for(int i=0;i<Noten.length; i++){
            sum=sum+Noten[i];
        }
        return sum/ Noten.length;
    }

    /**
     * liefert ein Array mit agerundete Noten zuruck
     * @param Noten
     * @return ein Array mit agerundete Noten
     */
    public static int[] Abrudnen(int[] Noten){
        int[] tempNoten=new int [Noten.length];
        for(int i=0; i< Noten.length;i++)
            tempNoten[i]=Noten[i];


        for(int i=0;i< tempNoten.length; i++){
            if ((tempNoten[i]+1)%5==0){
                tempNoten[i]=tempNoten[i]+1;
            }
            if ((tempNoten[i]+2)%5==0){
                tempNoten[i]=tempNoten[i]+2;
            }
        }
        return tempNoten;
    }

    /**
     * berechnet die maximale abgerundete Note
     * @param Noten
     * @return die maximale abgerundete Note
     */
    public static int MaxAbrundeteNote(int[] Noten){
        int[] abgerundet=Abrudnen(Noten);
        int max=0;
        for(int i=0; i< Noten.length;i++){
            if (Noten[i]!=abgerundet[i]){
                if(abgerundet[i]>max){
                    max=abgerundet[i];
                }
            }
        }
        return max;
    }
}
