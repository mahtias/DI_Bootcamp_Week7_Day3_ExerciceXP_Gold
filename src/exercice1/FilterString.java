/**
 * @author N'ZO LAGOU
 * Given a list of strings, write a method that returns a list 
 * of all strings that start with the letter a (lower case) and have exactly 3 letters.

TIP: Use Lambdas and Streams API’s.
 */

package exercice1;

import java.util.List;

public class FilterString {
	 public List<String> search(List<String> list) {
	        return list.stream().filter(item -> item.startsWith("a") && item.length() == 3).toList();
	    }

}
