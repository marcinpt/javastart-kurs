package com.company;

public class TabliceWw {
    public static void main(String[] args){
//        1.14 Przy użyciu pętli i tablic przechowujących liczby całkowite zaprezentuj poniższą treść:
//tab[0,0] = 0;
//tab[0,1] = 1;
//tab[0,2] = 2;
//tab[1,0] = 3;
//tab[1,1] = 4;
//tab[1,2] = 5;
//Wykorzystuj przy tym własność length.


        int[][] tab = new int[2][3];
        int a=0;

        for(int i=0; i<tab.length; i++)
            for(int j=0; j<tab[i].length; j++)
                tab[i][j]=a++;

        System.out.println("Tablice 2x3 wypelniono takimi wartosciami: ");
        for(int i=0; i<tab.length; i++)
            for(int j=0; j<tab[i].length; j++)
//                System.out.println("tab["+i+", "+j+"] = "+tab[i][j]);

//                lub prosciej (Wyświetlamy wynik analogicznie. Używamy w tym celu metody printf().
                // W znaku cudzysłowu umieszczamy to co chcemy wyświetlić jednocześnie podając parametry. %d to argument
                // całkowitoliczbowy. Później po przecinku podajemy wartości w odpowiedniej kolejności, które są
                // pobierane do wyświetlanego tekstu.):

                System.out.printf("tab[%d,%d]=%d \n", i, j, tab[i][j]);


    }

}
