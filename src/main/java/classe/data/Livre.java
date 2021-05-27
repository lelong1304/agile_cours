package classe.data;

import classe.behavior.Observer;
import classe.behavior.PaiementStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Livre
{
    private String name;
    private float price;
    private List<Observer> observers = new ArrayList<>();
    public Livre(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public void pay(PaiementStrategy methode){
        float amount = this.getPrice();
        methode.pay(amount);
        notifyUpdate();
    }
    public void attach(Observer o) {
        observers.add(o);
    }
    public void notifyUpdate() {
        for(Observer o: observers) {
            o.update(this);
        }
    }
}


