package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        int f1 = 5 * x * x + 3;
        int f2 = 5 * y * y + 3;

        if (f1 == f2) {
            return x - y;
        } else {
            return f1 - f2;
        }
    }
}
