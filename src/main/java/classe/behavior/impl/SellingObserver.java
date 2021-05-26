package classe.behavior.impl;

import classe.behavior.Observer;
import classe.data.Company;
import classe.data.Livre;

public class SellingObserver extends Observer {
    public SellingObserver(Company c) {
        this.company = c;
    }
    @Override
    public void update(Livre livre) {
        this.company.setRevenue(this.company.getRevenue() + livre.getPrixLivre());

        System.out.println("Compagnie "+ company.getName() + " a vendu la livre "+ livre.getName() +" la revenue totale est "+ this.company.getRevenue());
    }
}
