/**
 * @author N'ZO LAGOU
 * Écrivez une méthode qui renvoie une chaîne séparée par 
des virgules basée sur une liste donnée d'entiers.

Chaque élément doit être précédé de la lettre esi le nombre 
est pair et précédé de la lettre osi le nombre est impair.

Par exemple, si la liste d'entrée est (3,44), la sortie doit être 'o3,e44'.
 */

package exercice2;

import java.util.List;

public class SepareParVirgules {
    String commaSeparated = "";

    public String getString(List<Integer> list) {
        list.forEach(data -> {
            commaSeparated += data.intValue() % 2 == 0 ? "e" + data : "o" + data;
            commaSeparated += ",";
        });
        //Supprimer la dernière virgule
        commaSeparated = commaSeparated.substring(0, commaSeparated.length() - 1);
        return commaSeparated;
    }

}
