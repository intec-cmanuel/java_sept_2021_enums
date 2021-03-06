package be.intecbrussel.exercises;

import be.intecbrussel.Coin;

public class MoneyApp {
    public static void main(String[] args) {

        Coin[] coins = Coin.values();
        System.out.println("The value of all coins is: " + calculateValue(coins) + "cent");

    }

    private static int calculateValue(Coin[] coins){
        int totalValue = 0;
        for (Coin c : coins) {
            totalValue += c.getValue();
        }
        return totalValue;
    }
}
