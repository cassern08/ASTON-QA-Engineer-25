package HomeWork13;

import java.util.*;


public class PhoneBook {
    private final Map<String, List<String>> phoneBookMap = new HashMap<>();


    public void add(String surname, String phone) {
        phoneBookMap.computeIfAbsent(surname, k -> new ArrayList<>()).add(phone);
    }

    public List<String> get(String surname) {
        return phoneBookMap.getOrDefault(surname, Collections.emptyList());
    }
}