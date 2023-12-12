package Płacenie;

import java.util.Scanner;

public class PłacenieKartą implements Płacenie_za_zakup{
    @Override
    public void plac() {
        System.out.println("Podaj numer karty: ");
        Scanner sc = new Scanner(System.in);
        String numer = sc.nextLine();
        System.out.println("Zapłacono kartą o numerze: " + numer);
    }
}
