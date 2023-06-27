package ru.feoktistov.springcourse.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {
    private List<String> arrayList = new ArrayList<>();

    public ClassicalMusic() {
        arrayList.add("Hungarian Rhapsody");
        arrayList.add("Symphonia");
        arrayList.add("Schelkunchik");
    }

    @Override
    public List<String> getSong() {
        return this.arrayList;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}
