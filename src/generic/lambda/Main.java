package generic.lambda;

import java.util.ArrayList;
import java.util.List;

import exercice1.FilterString;
import exercice2.SepareParVirgules;
import exercie3.ElementMaxDePlage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("******filtrer pas chaine de caractere*******");

		// Exercice 1
		List<String> listChaine = new ArrayList<>();
		listChaine.add("pecule");
		listChaine.add("operationel");
		listChaine.add("edit");
		listChaine.add("beybye");
		listChaine.add("bob");
		listChaine.add("remove");
		listChaine.add("gitadd");
		List<String> result = new FilterString().search(listChaine);
		result.forEach(data -> System.out.println(data));

		System.out.println("******separer par des virgles*******");
		// Exercice 2
		List<Integer> stringList = new ArrayList<>();
		stringList.add(4);
		stringList.add(55);
		System.out.println(new SepareParVirgules().getString(stringList));

		System.out.println("******Élément Maximal Dans La Plage*******");

		// Exercice 3
		List<Integer> stringList2 = new ArrayList<>();
		stringList2.add(10);
		stringList2.add(-8);
		stringList2.add(-1);
		stringList2.add(24);
		stringList2.add(9);
		System.out.println("The max from item at index 1 to 3 is " + ElementMaxDePlage.findMax(stringList2, 5, 1));

	}

}
