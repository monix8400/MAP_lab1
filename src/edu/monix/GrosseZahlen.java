package edu.monix;

import java.math.BigInteger;

public class GrosseZahlen {     //PROBLEM3

    /**
     *  berechnet die Summe von 2 Zahlen gleicher Lange
     * @param zahl1,zahl2 2 Zahlen in form von Arrays
     * @return die Summe in form eines Array
     */
    public static int[] summe(int[] zahl1, int[] zahl2){
        int[] sum=new int[zahl1.length+1];                      //man bildet ein neues Array fur das Ergebniss der Summe
        int rest = 0;
        for(int i= zahl1.length-1; i>=0;i--) {                  //man geht vom Ende des Arrays nach vorne
            if (zahl1[i] + zahl2[i] + rest > 9) {               //wenn die Summe der Zahlen von Position i und Rest ist grosser als 9
                sum[i + 1] = (zahl1[i] + zahl2[i] + rest) % 10; //dann wird das Ergebniss Array si 2-te Ziffer der Zahl bekommen
                rest = (zahl1[i] + zahl2[i] + rest) / 10;       //und die erste wird im Rest behalten bleiben
            } else {                                            //sonst,
                sum[i + 1] = (zahl1[i] + zahl2[i] + rest);      //wird das Ergebniss Array die Zahl bekommen
                rest = 0;                                       //und das Rest wird 0, weil er benutt wurde
            }
            if (i == 0 && rest != 0)                            //wenn man an die erste Ziffer der Parametter Array ankommnt, und das rest ist verschieden von 0
                sum[i] = rest;                                  //dann wird sie das Wert des Rest bekommen
        }
        if(sum[0]==0){                             //im fall wenn das Ergebniss Array die gleiche Lange wie die anderen hat,
            int[] temp=new int[sum.length-1];      //macht man einen neuen Array mit eine kleinere Lange
            for(int i=0;i<sum.length-1;i++)        //Das alles wird durchgefuhrt, damit die Zahl nicht mit 0 beginnt
                temp[i]=sum[i+1];
            return temp;
        }
        return sum;
    }

    /**
     * berechnet die Differenz zwischen 2 Zahlen gleicher Lange
     * @param zahl1,zahl2 2 Zahlen in form von Arrays
     * @return die Differenz in form eines Array
     */
    public static int[] differenz(int[] zahl1, int[] zahl2) {
        int[] diff = new int[zahl1.length];
        int[] subtrahend = new int[zahl1.length];

        boolean tauschen = false;
        int k = 0;
        while (!tauschen && k < zahl1.length) {     //man bestimmt welche die kleinere Zahl ist
            if (zahl1[0] > zahl2[0])
                k = zahl1.length - 1;
            if (zahl1[k] < zahl2[k])
                tauschen = true;
            k++;
        }
        if (tauschen) {                             //wenn die 2-te Zahl grosser ist, dann verden die Zahlen getauscht
            diff = zahl2;
            subtrahend = zahl1;
        } else {
            diff = zahl1;
            subtrahend = zahl2;
        }

        int minus = 0;
        for (int i = diff.length - 1; i >= 0; i--) {        //beginnend vom Ende
            if (diff[i] < subtrahend[i]) {                  //wenn die ziffer der 2-ten Zahl grosser als di der ersten Zahl ist
                diff[i] = 10 + diff[i] - subtrahend[i];
                minus = 1;
            } else {                                        //sonst
                diff[i] = diff[i] - subtrahend[i] - minus;
                minus = 0;
            }
        }
        if (diff[0] == 0) {                             //im fall wenn das Ergebniss Array eine kleinere Lange hat,
            int[] temp = new int[diff.length - 1];      //macht man einen neuen Array mit eine kleinere Lange
            for (int i = 0; i < diff.length - 1; i++)        //Das alles wird durchgefuhrt, damit die Zahl nicht mit 0 beginnt
                temp[i] = diff[i + 1];
            return temp;
        }
        return diff;
    }

    /**
     * berechnet die Multiplication 2-er Zahlen gleicher Lange
     * @param zahl1 die grosse Zahl in form eines Array
     * @param zahl2 ein Int, der die grosse Zahl Teilt
     * @return die Multiplikation in form eines Array
     */
    public static int[] multiplication(int[] zahl1, int zahl2) {
        int[] produkt = new int[zahl1.length + 1];
        int rest = 0;
        for (int i = zahl1.length - 1; i >= 0; i--) {               //beginnend vom Ende
            if (zahl1[i] * zahl2 + rest > 9) {                      //berechnet man ahnlich mit der Summe
                produkt[i + 1] = (zahl1[i] * zahl2 + rest) % 10;
                rest = (zahl1[i] * zahl2 + rest) / 10;
            } else {
                produkt[i + 1] = (zahl1[i] * zahl2 + rest);
                rest = 0;
            }
            if (i == 0 && rest != 0)
                produkt[i] = rest;
        }

        if (produkt[0] == 0) {                             //im fall wenn das Ergebniss Array eine kleinere Lange hat,
            int[] temp = new int[produkt.length - 1];      //macht man einen neuen Array mit eine kleinere Lange
            for (int i = 0; i < produkt.length - 1; i++)        //Das alles wird durchgefuhrt, damit die Zahl nicht mit 0 beginnt
                temp[i] = produkt[i + 1];
            return temp;
        }
        return produkt;
    }

    /*
    am incercat sa reproduc o impartire si merge dar doar pe anumite numere(unul din ele ar fii cel din exemplu)
    /**
     * berechnet die Division 2-er Zahlen
     * @param zahl1 die grosse Zahl in form eines Array
     * @param zahl2 ein Int, der die grosse Zahl Teilt
     * @return die Division in form eines Array
     *
    public static int[] division(int[] zahl1,int zahl2) {
        int[] quotient = new int[zahl1.length];
        int rest = 0;
        for (int i = 0; i < zahl1.length - 1; i++) {
            if (zahl1[i] < zahl2) {
                rest = (zahl1[i] * 10 + zahl1[i + 1]) % zahl2;
            } else {
                quotient[i] = (zahl1[i]) / zahl2;
                rest = (zahl1[i]) % zahl2;
            }
            if (rest != 0) {
                zahl1[i + 1] = rest * 10 + zahl1[i + 1];
                rest = 0;
            }
        }
        return quotient;
    }*/

    /**
     * wandelt ein String in einem Array um
     * @param zahl ein String
     * @return ein Array
     */
    public static char[] konvertierenInArray(String zahl){
        char[] resultat = new char[zahl.length()];
        for (int i = 0; i < zahl.length(); i++) {
            resultat[i] = zahl.charAt(i);
        }
        return resultat;
    }

    /**
     * wandelt ein Array in einem BigInteger um
     * @param zahl ein Array
     * @return Zahl als BigInteger
     */
    public static BigInteger konvertierenInBigInt(int[] zahl) {
        StringBuffer buff = new StringBuffer();
        for(int i = 0; i < zahl.length; i++){
            buff.append(zahl[i]);
        }
        String z1 = buff.toString();    //Der Array wird als String gewandelt
        BigInteger nr = new BigInteger(z1);

        return nr;
    }

    /**
     *berechnet die Division 2-er Zahlen
     * @param zahl1 ein Array
     * @param zahl2 ein Int
     * @return ein Array mit dem Resultat
     */
    public static char[] division(int[] zahl1, int zahl2){
        BigInteger Quot;
        BigInteger bigZahl1=konvertierenInBigInt(zahl1);
        Quot = bigZahl1.divide(BigInteger.valueOf(zahl2));  // Die Zahlen werden geteilt

        String quotient=Quot.toString();

        return konvertierenInArray(quotient);

    }
}
