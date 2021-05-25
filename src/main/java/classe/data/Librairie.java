package classe.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Librairie {
	private String librairieName;
	public ArrayList<Livre> livreList = new ArrayList<Livre> ();

	public Librairie(String bookstore) {
		this.librairieName = bookstore;

	}
}
