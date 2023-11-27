package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Integer> names = new HashMap<>();

    public int add(String name, int number) {
        if (names.containsKey(name)) return names.size();
        names.put(name, number);
        return names.size();
    }

    public String findByNumber(int number) {
        for (Map.Entry<String, Integer> entry : names.entrySet()) {
            if (entry.getValue() == number) return entry.getKey();
        }
        return null;
    }

    public int findByName(String name) {
        if (names.get(name) == null) return 0;
        return names.get(name);
    }

    public boolean printAllNames(){
        return false;
    }
}
