package Płacenie;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PłacenieBlikiem implements Płacenie_za_zakup{
    @Override
    public void plac() {
        System.out.println("PODAJ KOD BLIK: ");
        Scanner sc = new Scanner(System.in);
        String KodBlik = sc.nextLine();
        System.out.println("Zapłacano kodem: " + KodBlik);
    }
}
