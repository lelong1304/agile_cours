package agile_course;

import classe.behavior.impl.CardStrategy;
import classe.behavior.impl.PaypalStrategy;
import classe.behavior.impl.SellingObserver;
import classe.data.Company;
import classe.data.Livre;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		Company c1 = new Company("c1");
		Company c2 = new Company("c2");
		Livre livre1 = new Livre("learn piano",25);
		Livre livre2 = new Livre("learn guitar",30);
		Livre livre3 = new Livre("learn boxing",35);
		SellingObserver s1 = new SellingObserver(c1);
		livre1.attach(s1);
		livre3.attach(s1);
		livre1.pay(new PaypalStrategy("idExemple", "passwordExemple"));
		livre2.pay(new CardStrategy( "1234567890123456", "786", "12/15"));
		livre3.pay(new PaypalStrategy("idExemple", "passwordExemple"));



	}

}
