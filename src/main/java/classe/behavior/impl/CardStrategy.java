package classe.behavior.impl;

import classe.behavior.PaiementStrategy;

public class CardStrategy implements PaiementStrategy {
    private String numeroCarte;
    private String cryptogramme;
    private String dateExpiration;

    public CardStrategy(String num, String crypto, String date) {
        this.numeroCarte = num;
        this.cryptogramme = crypto;
        this.dateExpiration = date;
    }

    @Override
    public void pay(float amount) {
        System.out.println(amount + "€ payés par carte de crédit.");
    }
}
