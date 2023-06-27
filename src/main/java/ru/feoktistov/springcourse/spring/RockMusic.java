package ru.feoktistov.springcourse.spring;

import java.util.ArrayList;
import java.util.List;

//@Component
class RockMusic implements Music {
    private List<String> arrayList = new ArrayList<>();

    public RockMusic() {
        arrayList.add("Rammstein");
        arrayList.add("Rock2");
        arrayList.add("Rock3");
    }

    @Override
    public List<String> getSong() {
        return arrayList;
    }
}
