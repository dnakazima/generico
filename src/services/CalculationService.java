
package services;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<T>> T max(List<T> list) {//acha o maior numa lista de inteiros
		if (list.isEmpty()) {//programação defensiva ver se não é vazia
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}