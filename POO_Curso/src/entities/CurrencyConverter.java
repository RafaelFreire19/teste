package entities;

public class CurrencyConverter {

    public static double conversor (double precoDoDolar , double valorDeDolares){
        return valorDeDolares*precoDoDolar;
    }


    public static double total(double precoDoDolar , double valorDeDolares){
        return precoDoDolar*valorDeDolares*6/100+precoDoDolar*valorDeDolares;
    }
}
