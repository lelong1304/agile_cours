package classe.behavior.impl;

import classe.behavior.PaiementStrategy;

public class PaypalStrategy implements PaiementStrategy {

    private String id;
    private String password;
    private float amount;

    public PaypalStrategy(String email, String pass){
        this.id=id;
        this.password=pass;
    }

    @Override
    public float pay(float amount) {
        System.out.println(amount + "€ payés par Paypal.");
        return amount;

    }

}
