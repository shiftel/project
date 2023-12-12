package Klasy;

import Klasy.Klient;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class SystemLogowania {

    private static ArrayList<Klient> klients = new ArrayList<>();

    public static Klient zaloguj() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login: ");
        String login = sc.nextLine();
        System.out.println("Hasło: ");
        String haslo = sc.nextLine();

        Klient user = new Klient();

        if (czyPoprawneDaneLogowania(login, haslo)) {
            for (Klient klient: klients) {
                if (klient.getLogin().equals(login)) {
                    user = klient;
                }
            }
        }
        return user;
    }

    public static boolean czyPoprawneDaneLogowania(String login, String haslo) {
        boolean isValid = false;

        try (BufferedReader br = new BufferedReader(new FileReader("baza_logowania.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length >= 2 && login.equals(parts[0].trim()) && haslo.equals(parts[1].trim())) {
                    isValid = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu pliku.");
            e.printStackTrace();
        }

        return isValid;
    }

    public static void dodaj(Klient klient) {
        klients.add(klient);
    }


}