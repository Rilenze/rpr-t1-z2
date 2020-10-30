package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj) {
        int suma = 0;
        while (broj != 0) {
            suma += broj % 10;
            broj = broj / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Unesite n: ");
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();
        int i;
        for (i=1; i<n; i++) {
            if (i % sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }
}
