package section19.exemplogenericsdelimitados.services;

import java.util.Collections;
import java.util.List;

public class CalculationService<T extends Comparable<T>> {

    public T max(List<T> list) {
        return Collections.max(list);
    }
}
