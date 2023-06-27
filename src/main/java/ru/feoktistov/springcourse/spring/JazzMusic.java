package ru.feoktistov.springcourse.spring;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {
    private List<String> arrayList = new ArrayList<>();

    public JazzMusic() {
        arrayList.add("Jazz1");
        arrayList.add("Jazz2");
        arrayList.add("Jazz3");
    }

    @Override
    public List<String> getSong() {
        return arrayList;
    }
}
