package com.example.demo;

import java.util.HashMap;


public class Cache {
    HashMap<Integer, String> map = new HashMap();


    public String get(int id) {
        return map.get(id);
    }

    public void set(int id, String value) {
        map.put(id, value);
    }

    public boolean has(int id) {
        if (map.get(id) == null) {
            return false;
        }
        return true;
    }

    public void delete(int id) {
        map.remove(id);
    }
}
