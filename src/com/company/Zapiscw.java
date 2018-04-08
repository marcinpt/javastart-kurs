//1.8 Napisz program, w którym wprowadzisz w konsoli swoje imię, następnie zapiszesz je do pliku. Odczytaj je z powrotem
// z pliku i bez użycia dodatkowej zmiennej wyświetl na ekranie


package com.company;
//import java.io.PrintWriter;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class Zapiscw {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner odczytzk = new Scanner(System.in);
//        System.out.println("Podaj swoje imie:");
//        String imie = odczytzk.nextLine();
//
//        PrintWriter zapdp = new PrintWriter("test1.txt");
//        zapdp.println(imie);
//        zapdp.close();
//        System.out.println("Zapisano dane do pliku");
//
//        File plik = new File("test1.txt");
//        Scanner odczytzp = new Scanner(plik);
//        System.out.println("Czesc (...pobieranie danych z pliku...) "+odczytzp.nextLine());
//
//    }
//}


import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zapiscw {
    public static void main(String[] args) throws FileNotFoundException {
// odczyt z kl i zapis do mem
        System.out.println("Podaj swoje imie");
        Scanner czytzkl = new Scanner(System.in);
        String imie = czytzkl.nextLine();
// zapis z mem do pliku
        PrintWriter zapisdp = new PrintWriter("test1.txt");
        zapisdp.print(imie);
        zapisdp.close();

// odczyt z pliku i wysw w konsoli bez tworzenia nowego Stringu
        File plik = new File("test1.txt");
        Scanner czytzp = new Scanner(plik);
        System.out.println(czytzp.nextLine());
    }
}