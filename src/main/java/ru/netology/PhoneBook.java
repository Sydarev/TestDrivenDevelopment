package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Integer> names = new HashMap<>();

    public int add(String name, int number){
        if (names.containsKey(name)) return names.size();
        names.put(name, number);
        return names.size();
    }
}
