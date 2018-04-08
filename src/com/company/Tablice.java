package com.company;
import java.util.Scanner;

public class Tablice {
    public static void main(String[] args){

////      1.12 Napisz program, w którym zadeklarujesz i utworzysz pięcioelementową tablicę odpowiedniego typu.
////      W pętli pobierzesz od użytkownika 5 imion i je w niej zapiszesz. Następnie wyświetl na ekranie powiadomienia
////      "Witaj imie_z_tablicy" dla każdego z podanych parametrów.
//
//        String[] imiona = new String[5];
//        Scanner odczytzk = new Scanner(System.in);
//
//        for(int i=0; i<5; i++){
//            System.out.print("Podaj imie nr "+(i+1)+": ");
//            imiona[i] = odczytzk.nextLine();
//        }
//        for(int i=0; i<5; i++){
//            System.out.println("Witaj "+imiona[i]);
//        }


//      1.13 Utwórz tablicę typu int przechowującą n elementów - gdzie n jest parametrem pobieranym od użytkownika.
//      Następnie wypełnij ją liczbami od 1 do n i wyświetl zawartość na ekranie przy pomocy pętli while.

        System.out.print("Ile wierszy ma zawierać tablica: ");
        Scanner odczytzk = new Scanner(System.in);
        int n = odczytzk.nextInt();

        int[] liczby = new int[n];
        for(int i=0; i<n; i++){
            liczby[i] = i+1;
        }
        System.out.print("Wypelniono tablice liczbami: ");
        int a=0;
        while(a<liczby.length){
            System.out.print(liczby[a]+", ");
            a++;
        }

    }
}
