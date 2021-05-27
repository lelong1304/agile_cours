package classe.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@NoArgsConstructor
@Getter
@Setter
public class Librairie {
	private String name;
	public ArrayList<Livre> livreList = new ArrayList<Livre> ();

	public Librairie(String bookstore) {
		this.name = bookstore;

	}

	public void addLivre(Livre livre) {
		livreList.add(livre);
	}
}
