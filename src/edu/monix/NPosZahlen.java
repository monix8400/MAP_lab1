package edu.monix;

public class NPosZahlen {

    public static int maxZahl( int[] Zahlen){
        int max=Zahlen[0];
        for (int i=0; i<Zahlen.length;i++){
            if (i>max){
                max=Zahlen[i];}
        }
        return max;
    }


    public static int minZahl( int[] Zahlen){
        int min=Zahlen[0];
        for (int i=0; i<Zahlen.length;i++){
            if (i<min){
                min=Zahlen[i];
            }
        }
        return min;
    }


    public static void show(int[] Zahlen){
        for(int i=0;i< Zahlen.length;i++){
            System.out.print(Zahlen[i]);
        }
        System.out.println(' ');
    }


    public static int maxSum(int[] Zahlen){
        int sum=0;
        for(int i= Zahlen.length-1; i>0; i--){
            sum=sum+Zahlen[i];

        }
        return sum;
    }


    public static int minSum(int[] Zahlen){
        int sum=0;
        for(int i=0; i< Zahlen.length-1; i++){
            sum=sum+Zahlen[i];
        }
        return sum;
    }
}
