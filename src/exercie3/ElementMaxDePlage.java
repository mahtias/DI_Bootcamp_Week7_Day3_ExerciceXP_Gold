/**
 * @author N'ZO LAGOU
 * Écrire une méthode générique pour trouver l'élément 
 * maximal dans la plage [begin, end)d'une liste
 */

package exercie3;

import java.util.List;

public class ElementMaxDePlage {
	public static <T> double findMax(List<T> list, int begin, int end) {
        double max = list.stream().filter(data -> {
                    return list.indexOf(data) >= begin;
                })
                .filter(data -> {
                    return list.indexOf(data) <= end;
                })
                .mapToDouble(data -> {
                    if (data instanceof Double) {
                        return (Double) data;
                    } else {
                        return (Integer) data;
                    }
                })
                .max()
                .orElseThrow();

        return max;
    }

}
