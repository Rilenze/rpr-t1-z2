package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public int sumaCifara(int broj) {
        int suma = 0;
        while (broj != 0) {
            suma += broj % 10;
            broj = broj / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        int n;
    }
}
