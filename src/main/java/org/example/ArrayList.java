package org.example;

import java.util.List;

public class ArrayList {

    List<Integer> list = new java.util.ArrayList<>();

    public ArrayList(int n) {
        for (int i = 1; i < n; i++) {
            list.add(i);
        }
    }

    public List<Integer> getList() {
        return list;
    }
}
