package org.example;

public class ExchangePreformer {

    public static double sek_usd_convert(double sek){
        return sek*CurrencyRate.sek_usd;
    }

    public static double usd_sek_convert(double usd){
        return usd*CurrencyRate.usd_sek;
    }

    public static double sek_eur_convert(double sek){
        return sek*CurrencyRate.sek_eur;
    }

    public static double eur_sek_convert(double eur){
        return eur*CurrencyRate.eur_sek;
    }



}
