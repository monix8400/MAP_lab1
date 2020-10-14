package edu.monix;

public class GrosseZahlen {

    public static int[] summe(int[] zahl1, int[] zahl2){ //berechnet die Summe von 2 Zahlen gleicher Lange
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


    public static int[] differenz(int[] zahl1, int[] zahl2) {   //berechnet die Differenz zwischen 2 Zahlen gleicher Lange
        int[] diff = new int[zahl1.length];
        int[] subtrahend = new int[zahl1.length];

        boolean tauschen = false;
        int k = 0;
        while (!tauschen && k < zahl1.length) {
            if (zahl1[0] > zahl2[0])
                k = zahl1.length - 1;
            if (zahl1[k] < zahl2[k])
                tauschen = true;
            k++;
        }
        if (tauschen) {
            diff = zahl2;
            subtrahend = zahl1;
        } else {
            diff = zahl1;
            subtrahend = zahl2;
        }

        int minus = 0;
        for (int i = diff.length - 1; i >= 0; i--) {
            if (diff[i] < subtrahend[i]) {
                diff[i] = 10 + diff[i] - subtrahend[i];
                minus = 1;
            } else {
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


    public static int[] multiplication(int[] zahl1, int zahl2) {    //berechnet die Multiplication 2-er Zahlen gleicher Lange
        int[] produkt = new int[zahl1.length + 1];
        int rest = 0;
        for (int i = zahl1.length - 1; i >= 0; i--) {                  //man geht vom Ende des Arrays nach vorne
            if (zahl1[i] * zahl2 + rest > 9) {               //wenn die Summe der Zahlen von Position i und Rest ist grosser als 9
                produkt[i + 1] = (zahl1[i] * zahl2 + rest) % 10; //dann wird das Ergebniss Array si 2-te Ziffer der Zahl bekommen
                rest = (zahl1[i] * zahl2 + rest) / 10;       //und die erste wird im Rest behalten bleiben
            } else {                                            //sonst,
                produkt[i + 1] = (zahl1[i] * zahl2 + rest);      //wird das Ergebniss Array die Zahl bekommen
                rest = 0;                                       //und das Rest wird 0, weil er benutt wurde
            }
            if (i == 0 && rest != 0)                            //wenn man an die erste Ziffer der Parametter Array ankommnt, und das rest ist verschieden von 0
                produkt[i] = rest;                                  //dann wird sie das Wert des Rest bekommen
        }

        if (produkt[0] == 0) {                             //im fall wenn das Ergebniss Array eine kleinere Lange hat,
            int[] temp = new int[produkt.length - 1];      //macht man einen neuen Array mit eine kleinere Lange
            for (int i = 0; i < produkt.length - 1; i++)        //Das alles wird durchgefuhrt, damit die Zahl nicht mit 0 beginnt
                temp[i] = produkt[i + 1];
            return temp;
        }
        return produkt;
    }


    public static int[] division(int[] zahl1,int zahl2) {   //berechnet die Division 2-er Zahlen gleicher Lange
        int[] quotient = new int[zahl1.length];
        int rest = 0;
        for (int i = 0; i < zahl1.length - 1; i++) {
            if (zahl1[i] < zahl2) {
                rest = (zahl1[i] * 10 + zahl1[i + 1]) % 2;
            } else {
                quotient[i] = (zahl1[i]) / zahl2;
                rest = (zahl1[i]) % 2;
            }
            if (rest != 0) {
                zahl1[i + 1] = rest * 10 + zahl1[i + 1];
                rest = 0;
            }
        }
        return quotient;
    }
}
