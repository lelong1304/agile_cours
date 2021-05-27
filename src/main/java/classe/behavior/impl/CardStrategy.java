package classe.behavior.impl;

import classe.behavior.PaiementStrategy;

public class CardStrategy implements PaiementStrategy {
    private String numberCard;
    private String cryptogram;
    private String dateExpiration;

    public CardStrategy(String num, String crypto, String date) {
        this.numberCard = num;
        this.cryptogram = crypto;
        this.dateExpiration = date;
    }

    @Override
    public float pay(float amount) {
        System.out.println(amount + "€ payés par carte de crédit.");
        return amount;
    }
}
