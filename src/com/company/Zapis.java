package com.company;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Zapis {
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter pisaniedp = new PrintWriter("test1.txt");
        pisaniedp.println("To jest 1sza zapisana linia w pliku");
        pisaniedp.close();
    }
}
