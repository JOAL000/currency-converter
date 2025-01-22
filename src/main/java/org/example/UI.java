package org.example;

import java.util.Scanner;

public class UI {

    public static void start() {

        boolean iterate = true;
        Scanner scanner = new Scanner(System.in);

        while (iterate) {
            displayMenu();

            int option = scanner.nextInt();
            double result;
            switch (option) {
                case 1:
                    result=ExchangePreformer.sek_usd_convert(conversionUI(scanner,"SEK"));
                    System.out.println(result+" USD");
                    break;
                case 2:
                    result=ExchangePreformer.usd_sek_convert(conversionUI(scanner,"USD"));
                    System.out.println(result+" SEK");
                    break;
                case 3:
                    result=ExchangePreformer.sek_eur_convert(conversionUI(scanner,"SEK"));
                    System.out.println(result+" EUR");
                    break;
                case 4:
                    result=ExchangePreformer.eur_sek_convert(conversionUI(scanner,"EUR"));
                    System.out.println(result+" SEK");
                    break;
                default:
                    iterate = false;
                    System.out.println("Program Closed");
            }
        }
    }


    protected static void displayMenu() {
        System.out.println("Welcome to Currency Converter");
        System.out.println("Choose the correspondent number:");
        System.out.println("1:SEK to USD Conversion");
        System.out.println("2:USD to SEK Conversion");
        System.out.println("3:SEK to EUR Conversion");
        System.out.println("4:EUR to SEK Conversion");
        System.out.println("Any other key: Exit");
    }

    protected static double conversionUI(Scanner scanner,String currency){
        System.out.println("Insert "+currency+" amount");
        return scanner.nextDouble();
    }


}
