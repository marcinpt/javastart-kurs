package com.company;
import java.util.Scanner;

public class Petle {
    public static void main(String[] args){
        System.out.println("Podaj jakas calkowita wartosc liczbowa");
        Scanner odczytzk = new Scanner(System.in);
        int licznik = odczytzk.nextInt();

        while(licznik>0){
            System.out.println("Bomba wybuchnie za: "+licznik--);
                    }
        System.out.println("Bum! :-)");





////  Petla while
//        int licznik = 0;
//        while(licznik<10) {
//            System.out.println("To jest petla");
//            licznik++;
//        }
//        System.out.println("Koniec petli while");


////   Petla do...while - tu wykonanie instrukcji a potem sprawdzenie warunku
//        int licznik = 20;
//        do{
//            System.out.println("To jest petla");
//            licznik++;
//        }
//        while(licznik<10);
//        System.out.println("Koniec  petli");


////        Petla for
//        for(int i=0; i<10; i++){
//            System.out.println("To jest petla for");
//        }
//        System.out.println("Koniec petli");

//        Cwiczenie on top


    }
}
