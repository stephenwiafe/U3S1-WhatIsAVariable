package com.codedifferently.lab.partB;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Coin coin0 = new Coin();
        Coin coin1 = new Coin("Penny", .01);
        Coin coin2 = new Coin("Quarter", .25);
        Coin coin3 = new Coin("Dime", .10);
        Coin coin4 = new Coin("Quarter", .25);
        Coin coin5 = new Coin("Penny", .01);

        Coin[] coins = {coin0, coin1, coin2, coin3, coin4, coin5};
        Arrays.sort(coins);

        int pennyCount = 0;
        int quarterCount = 0;
        int dimeCount = 0;

        for (Coin coin : coins) {
            switch (coin.getName()) {
                case "Penny":
                    pennyCount++;
                    break;
                case "Dime":
                    dimeCount++;
                    break;
                case "Quarter":
                    quarterCount++;
                    break;
                default:
                    break;
            }
        }

        String pennyDescription = "";
        String quarterDescription = "";
        String dimeDescription = "";

        if (quarterCount > 0) {
            quarterDescription = quarterCount + " Quarter coin" + (quarterCount > 1 ? "s" : "");
        }

        if (pennyCount > 0) {
            pennyDescription = pennyCount + " Penny coin" + (pennyCount > 1 ? "s" : "") + ", ";
        }

        if (dimeCount > 0) {
            dimeDescription = dimeCount + " Dime coin" + (dimeCount > 1 ? "s" : "") + ", ";
        }

        System.out.println("You have: " + pennyDescription + dimeDescription + quarterDescription);
    }
}

