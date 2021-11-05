package be.intecbrussel;

import java.util.Scanner;

public class EnumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much do you need to pay?");
        int amountToPay = scanner.nextInt();

        processPayment(amountToPay);
    }

    private static void processPayment(int amount) {
        int amountOfTwoEuros = 0;
        int amountOfOneEuros = 0;
        int amountOfFiftyCent = 0;
        int amountOfTwentyCent = 0;
        int amountOfTenCent = 0;
        int amountOfFiveCent = 0;
        int amountOfTwoCent = 0;
        int amountOfOneCent = 0;

        amountOfTwoEuros = getAmountOfACertainCoin(amount, Coin.TWO_EURO);
        amount -= Coin.TWO_EURO.getValue() * amountOfTwoEuros;

        amountOfOneEuros = getAmountOfACertainCoin(amount, Coin.ONE_EURO);
        amount -= Coin.ONE_EURO.getValue() * amountOfOneEuros;

        amountOfFiftyCent = getAmountOfACertainCoin(amount, Coin.FIFTY_CENT);
        amount -= Coin.FIFTY_CENT.getValue() * amountOfFiftyCent;

        amountOfTwentyCent = getAmountOfACertainCoin(amount, Coin.TWENTY_CENT);
        amount -= Coin.TWENTY_CENT.getValue() * amountOfTwentyCent;

        amountOfTenCent = getAmountOfACertainCoin(amount, Coin.TEN_CENT);
        amount -= Coin.TEN_CENT.getValue() * amountOfTenCent;

        amountOfFiveCent = getAmountOfACertainCoin(amount, Coin.FIVE_CENT);
        amount -= Coin.FIVE_CENT.getValue() * amountOfFiveCent;

        amountOfTwoCent = getAmountOfACertainCoin(amount, Coin.TWO_CENT);
        amount -= Coin.TWO_CENT.getValue() * amountOfTwoCent;

        amountOfOneCent = getAmountOfACertainCoin(amount, Coin.ONE_CENT);
        amount -= Coin.ONE_CENT.getValue() * amountOfOneCent;

        printCoins(amountOfTwoEuros, Coin.TWO_EURO);
        printCoins(amountOfOneEuros, Coin.ONE_EURO);
        printCoins(amountOfFiftyCent, Coin.FIFTY_CENT);
        printCoins(amountOfTwentyCent, Coin.TWENTY_CENT);
        printCoins(amountOfTenCent, Coin.TEN_CENT);
        printCoins(amountOfFiveCent, Coin.FIVE_CENT);
        printCoins(amountOfTwoCent, Coin.TWO_CENT);
        printCoins(amountOfOneCent, Coin.ONE_CENT);


    }

    private static int getAmountOfACertainCoin(int amount, Coin coin) {
        int amountOfCoin = 0;
        while (amount >= coin.getValue()) {
            amountOfCoin++;
            amount -= coin.getValue();
        }
        return amountOfCoin;
    }

    private static void printCoins(int amount, Coin coin) {
        if (amount != 0) {
            System.out.println(coin + ": " + amount);
        }
    }
}
