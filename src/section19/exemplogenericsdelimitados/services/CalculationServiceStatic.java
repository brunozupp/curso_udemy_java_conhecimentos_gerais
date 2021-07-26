package section19.exemplogenericsdelimitados.services;

import java.util.Collections;
import java.util.List;

public class CalculationServiceStatic {

    public static <T extends Comparable<T>> T max(List<T> list) {
        return Collections.max(list);
    }
}
