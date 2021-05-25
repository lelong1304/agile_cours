package classe.behavior;

import classe.data.Company;
import classe.data.Livre;

public abstract class Observer {
    protected Company company;
    public abstract void update(Livre livre);
}
